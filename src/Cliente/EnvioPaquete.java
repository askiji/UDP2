package Cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EnvioPaquete {
	byte[] mensaje_bytes = new byte[256];
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String mensaje="";
	DatagramPacket paquete;
	
	public DatagramPacket enviarPaquete(DatagramSocket socket, InetAddress address) {
		try {
			mensaje = in.readLine();
			mensaje_bytes = mensaje.getBytes();
			paquete = new DatagramPacket(mensaje_bytes,mensaje.length(),address,6000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return paquete;
				
		
	}
}
