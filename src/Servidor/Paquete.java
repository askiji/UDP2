package Servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;

public class Paquete extends Thread{
	 private byte[] mensaje_bytes = new byte[256];
	 private String mensaje;
	 private DatagramPacket paquete =  new DatagramPacket(mensaje_bytes,256);;
	 private DatagramSocket socket ;
	 
	 public HashMap<Integer, InetAddress> infoPaquete(DatagramSocket socket) {
		HashMap<Integer, InetAddress> infoDelPAquete = new HashMap<>();
		this.socket = socket;
		try {
			socket.receive(paquete);
			mensaje = new String(mensaje_bytes).trim();
			infoDelPAquete.put(paquete.getPort(), paquete.getAddress());
			System.out.println(mensaje);
//			envioPaquete(mensaje);
			ReenviarPaquete.reenviarTodos(mensaje, paquete.getPort());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return infoDelPAquete;
		
	}
	 public void paquetesParaTodos(String texto, InetAddress addres, int puerto) {
//			mensaje_bytes = new byte[256];
//			paquete= new DatagramPacket(mensaje_bytes,256);
			try {
				this.socket = new DatagramSocket();
				mensaje = new String(texto.getBytes());
				paquete = new DatagramPacket(texto.getBytes(), texto.length(), addres , puerto);
				this.socket.send(paquete);
				
				System.out.println("PAQUETE");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public Paquete() {
		super();
	}

@Override
public void run() {
	
	super.run();
}

}
