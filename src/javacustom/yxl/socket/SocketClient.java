package javacustom.yxl.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Socket¿Í»§¶Ë
 * 
 * @author Administrator
 * @date 2018.05.29
 */
public class SocketClient {
	
	public static void main(String[] args) {
		new SocketClient("127.0.0.1",1000);
	}
	
	public SocketClient(String url, int port) {
		try {
			Socket client = new Socket(url, port);
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
