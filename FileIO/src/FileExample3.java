import java.io.File;

public class FileExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:\\Java Training\\Course Content");  
	    String filenames[]=f.list();  
	    for(String filename:filenames){  
	        System.out.println(filename);  
	    }  
	}

}
