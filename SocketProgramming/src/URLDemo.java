import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url =new URL("https://www.javatpoint.com/java-tutorial");
		//194.169.80.121:443
		System.out.println("Protocal: "+url.getProtocol());
		System.out.println("Hostname:"+ url.getHost());
		System.out.println("Port Number:"+url.getPort());
		System.out.println("File Name:"+ url.getFile());
		
		System.out.println("####################");
		URL url1= new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
		System.out.println("Protocal: "+url1.getProtocol());
		System.out.println("Hostname:"+ url1.getHost());
		System.out.println("Port Number:"+url1.getPort());
		System.out.println("File Name:"+ url1.getFile());
		System.out.println("Default Port:"+ url1.getDefaultPort());
		System.out.println("Query String:"+url1.getQuery());
		System.out.println("Path:"+ url1.getPath());
		
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		URL url2 =new URL("https://www.javatpoint.com/java-tutorial");
		URLConnection urlConnection= url2.openConnection();
		InputStream is = urlConnection.getInputStream();
		int i;
		while((i=is.read())!=-1)
		{
			System.out.print((char)i);
		}
	
	
	
	}	

}
