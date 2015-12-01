package network_ex;

import java.net.*;

public class NetTest {

	// 1. IP
	// 2. 포트
	// 3. TCP
	// 4. UDP
	// 5. 소켓
	// Socket socekt = new Socket(host, port);
	// ServerSocket server = new ServerSocket(port);
	public static void main(String args[]) throws UnknownHostException {

		InetAddress addr1 = InetAddress.getByName("op.gg");
		InetAddress addr3 = InetAddress.getLocalHost();
		System.out.println("==========================================");
		System.out.println("ID " + addr1.getHostAddress());
		System.out.println("Host = " + addr1.getHostName());
		System.out.println("로컬 주소 = " + addr3.getHostAddress());
		System.out.println("로컬 이름 =  " + addr3.getHostName());
	}

}
