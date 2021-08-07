import java.io.File;

public class FileNotFoundException {

	public static void main(String[] args) throws java.io.FileNotFoundException, NullPointerException {
		// TODO Auto-generated method stub
		File file= new File("test2.txt");
		try {
			throw new java.io.FileNotFoundException("I don't like the Ex Message");
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		throw new NullPointerException("I don't like the Ex Message");
//			FileInputStream fis = new FileInputStream(file);
//		System.out.println("Program executed..");
		
	}

}
