
public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String Buffer is mutable and Thread Safe (multiple threads cannot access it simultaneously)
		
		StringBuffer s= new StringBuffer("Java");
		s.append("Programming");//it is original string is changed
		
		System.out.println(s.insert(0, "HI"));
		
		String st=new String("Java");//2
		st=st.concat("Programming");//original string will not be changed
		System.out.println(st);
		
		
		StringBuffer st1=new StringBuffer("JAVA");
		
		//logic to reverse a given string
		char[] chArr=st1.toString().toCharArray();
		String temp="";
		for(int i=(chArr.length-1);i>=0;i--)
		{
			temp=temp+chArr[i];
		}
		System.out.println(temp);
		
		st1.reverse();
		System.out.println(st1);//AVAJ
	}

}
