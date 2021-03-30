
public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		
		//1. using String.valueOf() method
		String str=String.valueOf(i);
		System.out.println(str);
		
		//2. using Integer.toString() method
		str= Integer.toString(i);
		System.out.println(str);
		
		//3. Using String.format() method
		str= String.format("%d", i);
		System.out.println(str);
		
		//4. appending int value to String
		str=""+i;
		System.out.println(str);
	}

}
