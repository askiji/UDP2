package Servidor;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Map;

public class ServidorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket socket;
		try {
			socket = new DatagramSocket(6000);
			do {
				Paquete p = new Paquete();
				Puertos.interPuertos.putAll(p.infoPaquete(socket));
				
			} while (true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

}
