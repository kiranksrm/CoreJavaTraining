import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Socket s = new Socket("localhost",2222);
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1="", str2="";
		while(!str1.equals("stop"))
		{
			str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			
			str2=din.readUTF();
			System.out.println("Server Says.. :"+str2);
		}
		
		din.close();
		dout.close();
		s.close();
		

	}

}
