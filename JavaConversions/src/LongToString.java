
public class LongToString {

	public static void main(String[] args) {
		// 1. Using String.ValueOf() method
		long l=22333L;
		
		String str=String.valueOf(l);
		System.out.println(str);
		
		//2. Using Long.toString() method
		str= Long.toString(l);
		System.out.println(str);
		
		//3. Using String.format() method
//		str= String.format("%L", l);
//		System.out.println(str);

	}

}
