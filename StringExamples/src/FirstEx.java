
public class FirstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("Hello");
		String str1="Hi";
		
		str=str.intern();
		String str2= new String("Hello");
		
		String str3="Hello";
		
		FirstEx f=new FirstEx();
		
		
		
		String str4="Hi";
		
		String str5= new String("World");
		
		//String str6=str5;
		
		String str7=str4+" How are you?";
		
		
		str4="How are you?";
		
		System.out.println(str4);
		
		
	}

}
