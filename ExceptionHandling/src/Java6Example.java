import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java6Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fout= new FileOutputStream(new File("test.txt")); FileInputStream fin= new FileInputStream(new File("test.txt")))
		{
			String str="Welcome to Java";
			
			fout.write(str.getBytes());
			
		}
		catch(FileNotFoundException fex)
		{
			System.out.println("FIle not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
