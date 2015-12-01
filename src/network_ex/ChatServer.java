package network_ex;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	private Vector handlers; // handlers : Socket들을 보관하는 장치

	public ChatServer(int port) {
		try {
			ServerSocket server = new ServerSocket(port);
			handlers = new Vector();
			System.out.println("ChatServer is ready");
			while (true) { // 별도로 돌아가는 프로세스
				Socket client = server.accept();
				ChatHandler c = new ChatHandler(this, client);
				c.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object getHandler(int index) {
		return handlers.elementAt(index); // 클라이언트에 대한 정보를 저장하고 있음
	}

	public void register(ChatHandler c) {
		handlers.addElement(c); // Socket을 보관하고 있음
	}

	public void unregister(Object o) {
		handlers.removeElement(o);
	} // 여러 사람들에게 보내기 위한 컬렉션

	public void broadcast(String message) { // 동시에 일어나는 현상들을 위해서
		synchronized (handlers) {
			int n = handlers.size();
			for (int i = 0; i < n; i++) {
				ChatHandler c = (ChatHandler) handlers.elementAt(i);
				try {
					c.println(message);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public static void main(String args[]) {
		ChatServer server = new ChatServer(9830);
	}
}
