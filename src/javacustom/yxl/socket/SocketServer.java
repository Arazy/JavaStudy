package javacustom.yxl.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Socket服务端
 * @author Administrator
 * @date 2018.05.29
 */
public class SocketServer {

    private ThreadPoolExecutor pool;
    private ServerSocket serverSocket;
    
	public SocketServer(int port) throws IOException{
		serverSocket = new ServerSocket(port);
	}
	
	public void run() throws IOException{
		pool = new ThreadPoolExecutor(10, 10000, 60, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(10));
		while(true){
			Socket server = serverSocket.accept();
			pool.execute(new RunnableServer(server));
		}
	}
	
	class RunnableServer implements Runnable {
	    private Socket server;
		public RunnableServer(Socket server){
			this.server=server;
		}
		
		@Override
		public void run() {
		    try{
		        System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
		        DataInputStream in = new DataInputStream(server.getInputStream());
		        System.out.println(in.readUTF());
		        DataOutputStream out = new DataOutputStream(server.getOutputStream());
		        out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
		        server.close();
		    }catch(SocketTimeoutException s){
		            System.out.println("Socket timed out!");
		    }catch(IOException e) {
		            e.printStackTrace();
		    }
		}
	}
}
