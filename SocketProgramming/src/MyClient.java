import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost", 5555);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server, how are you doing?..");
			dout.flush();
			dout.close();
			
			s.close();//close the socket
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
