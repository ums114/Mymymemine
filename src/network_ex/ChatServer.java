package network_ex;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	private Vector handlers; // handlers : Socket���� �����ϴ� ��ġ

	public ChatServer(int port) {
		try {
			ServerSocket server = new ServerSocket(port);
			handlers = new Vector();
			System.out.println("ChatServer is ready");
			while (true) { // ������ ���ư��� ���μ���
				Socket client = server.accept();
				ChatHandler c = new ChatHandler(this, client);
				c.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object getHandler(int index) {
		return handlers.elementAt(index); // Ŭ���̾�Ʈ�� ���� ������ �����ϰ� ����
	}

	public void register(ChatHandler c) {
		handlers.addElement(c); // Socket�� �����ϰ� ����
	}

	public void unregister(Object o) {
		handlers.removeElement(o);
	} // ���� ����鿡�� ������ ���� �÷���

	public void broadcast(String message) { // ���ÿ� �Ͼ�� ������� ���ؼ�
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
