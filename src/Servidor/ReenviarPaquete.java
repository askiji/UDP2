package Servidor;

import java.net.InetAddress;
import java.util.HashMap;

public class ReenviarPaquete {
	
	
	public static void reenviarTodos(String texto, Integer puerto){ 
		
		Puertos.interPuertos.forEach((a , b ) -> {
//			if(Puertos.interPuertos.get(b)!= null) {
				System.out.println("AAAAAAAAA");
				new Paquete().paquetesParaTodos(texto,Puertos.interPuertos.get(a), a );
				
//			}
		}) ;
		
//		for (HashMap<Integer, InetAddress> direcion : Puertos.interPuertos) {
//			
//		}
	}
	
	void paquete() {
		
	}
}
