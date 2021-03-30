import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		
		try {
			ServerSocket ss= new ServerSocket(5555);
			Socket s=ss.accept();//establishes the connection
			
			DataInputStream dis= new DataInputStream(s.getInputStream());
			String str= (String)dis.readUTF();
			System.out.println("Message="+str);
			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
