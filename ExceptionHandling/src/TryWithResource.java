import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//Java 1.7
		
		try(BufferedReader br =new BufferedReader(new FileReader("abc.txt")))
		{
			//
		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
		
		try(FileInputStream fis= new FileInputStream(new File("test2.txt")))
		{
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
		}
		
		/// try(R1; R2; R3)
		//{
			
//		}

	}

}
