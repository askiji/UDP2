package Cliente;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteMain {

	public static void main(String[] args) {
		DatagramSocket socket;
		InetAddress address;
		try {
			do {
				socket = new DatagramSocket();
				address=InetAddress.getByName("localhost");
				EnvioPaquete ep = new EnvioPaquete();
				socket.send(ep.enviarPaquete(socket, address));
			} while (true);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
