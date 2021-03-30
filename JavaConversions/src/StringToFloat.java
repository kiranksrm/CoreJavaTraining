
public class StringToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="23.6";
		//1. using Float.parseFloat() method
		float f= Float.parseFloat(str);
		System.out.println(f);
		
		str="23.6f";
		f=Float.parseFloat(str);
		System.out.println(f);
	}

}
