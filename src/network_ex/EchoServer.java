package network_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private ServerSocket server;

	public EchoServer(int port) throws IOException {
		server = new ServerSocket(port);
	}

	public void service() throws IOException {
		System.out.println("EchoServer is ready.");
		Socket client = server.accept();
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		PrintWriter out = new PrintWriter(os, true);
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			String msg = in.readLine();
			System.out.println(msg);
			String msgg = in2.readLine();

			if (msg.equals("bye")) {
				break;
			}
			out.println(">>>" + msgg);
		}
	}

	public void close() throws IOException {
		server.close();
	}

	public static void main(String args[]) {
		try {
			EchoServer es = new EchoServer(1289);
			es.service();
			es.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
