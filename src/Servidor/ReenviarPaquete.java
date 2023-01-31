package Servidor;

import java.net.InetAddress;
import java.util.HashMap;

public class ReenviarPaquete {
	
	
	public static void reenviarTodos(String texto, Integer puerto){ 
//		System.out.println(texto);
//		System.out.println(puerto.toString());
	//	Puertos.interPuertos.forEach((a,b) -> System.out.println(a +"AAAAAAAAAA"+b));
		Puertos.interPuertos.forEach((a , b ) -> {
			System.out.println(a + "-------"+ puerto);
			if(!a.equals(puerto)) {
				System.out.println(a +"+++++++"+ puerto);
				new Paquete().paquetesParaTodos(texto,b, a );
			}
		}) ;

	}
	void paquete() {
	}
}
