package Cliente;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecepcionPaquete extends Thread {
	String mensaje_llegada; 
	byte[] mensaje_bytes_llegada = new byte[256];
	DatagramPacket paqueteLegada = new DatagramPacket(mensaje_bytes_llegada,256);
	DatagramSocket socket;
	
	@Override
	public void run() {
		do {
			mensaje_bytes_llegada = new byte[256];
			paqueteLegada = new DatagramPacket(mensaje_bytes_llegada,256);
			try {
				socket.receive(paqueteLegada);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mensaje_llegada = new String(mensaje_bytes_llegada);
			System.out.println("Mensaje recibido del servidor: "+mensaje_llegada);
		} while (true);
	
//		super.run();
	}

	public RecepcionPaquete(DatagramSocket socket) {
		super();
		this.socket = socket;
	}
}
