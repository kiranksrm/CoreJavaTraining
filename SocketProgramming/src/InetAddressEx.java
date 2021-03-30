import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getByName("www.javatpoint.com");
		
		System.out.println("Hostname: "+ip.getHostName());
		System.out.println("IP address:"+ip.getHostAddress());
	}

}
