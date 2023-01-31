package Servidor;

import java.net.InetAddress;
import java.util.HashMap;

public class ReenviarPaquete {
	
	
	public static void reenviarTodos(String texto, Integer puerto){ 

		Puertos.interPuertos.forEach((a , b ) -> {
			if(!a.equals(puerto)) {
				new Paquete().paquetesParaTodos(texto,b, a );
			}
		}) ;

	}
	void paquete() {
	}
}
