package network_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatHandler extends Thread {
	private Socket s;
	private BufferedReader i;
	private PrintWriter o;
	private ChatServer server;

	public ChatHandler(ChatServer server, Socket s) throws IOException {
		this.s = s;
		this.server = server;
		InputStream ins = s.getInputStream();
		OutputStream os = s.getOutputStream();
		i = new BufferedReader(new InputStreamReader(ins));
		o = new PrintWriter(new OutputStreamWriter(os), true); // 입출력 장치
	}

	public void run() {
		String name = " ";
		try {
			name = i.readLine(); // 사용자 정의
			server.register(this);
			broadcast(name + "님이 방문하셨습니다.");
			while (true) { // 메세지 입력(메세지를 두번 이상 입력)
				String msg = i.readLine();
				broadcast(name + " - " + msg);
			}
		} catch (IOException ex) {
//			ex.printStackTrace();
		}
		server.unregister(this);
		broadcast(name + "님이 나가셨습니다.");

		try { // close 는 IO -> Socket 순서로 닫아준다. Socket안에 IO가 존재함.
			i.close();
			o.close();
			s.close();
		} catch (IOException ex) {
//			ex.printStackTrace();
		}
	}

	protected void println(String message) {
		o.println(message);
	}

	protected void broadcast(String message) {
		server.broadcast(message);
	}

}
