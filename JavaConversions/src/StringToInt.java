import java.text.NumberFormat;
import java.text.ParseException;

public class StringToInt {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub		
		String str1="100";
		String str2="200"; //300
		
		String str3= str1+str2;//100200
		
		short s=200;
		int x= s; //casting
		
		int i= Integer.parseInt(str1); //Conversion
		int j= Integer.parseInt(str2); //Conversion
		
		Integer i1=Integer.valueOf(str1); //String to Integer conversion
		Integer j1= Integer.valueOf(str2);
		
		String k =""+(i+j); 
		String k1=String.valueOf((i+j));
		
		System.out.println(k);
		
		String str10="Hello";
		NumberFormat ns= NumberFormat.getInstance();
		Number n=ns.parse(str10);
		

	}

}
