package Cliente;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteMain {

	public static void main(String[] args) {
		DatagramSocket socket;
		InetAddress address;
		try {
			socket = new DatagramSocket();
			address=InetAddress.getByName("localhost");
			new RecepcionPaquete(socket).start();
			do {
				EnvioPaquete ep = new EnvioPaquete();
				socket.send(ep.enviarPaquete(socket, address));
			} while (true);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
