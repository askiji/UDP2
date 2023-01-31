package Servidor;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Puertos {
	public static HashMap<Integer,InetAddress> interPuertos = new HashMap<>();

	public static void saveAddresPort(InetAddress direccion ,Integer puerto ) {
		interPuertos.put(puerto,direccion);
	};
	
}
