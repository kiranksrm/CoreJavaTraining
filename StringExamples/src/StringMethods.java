
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";      //String literal --> SCP--s1 var
		
		String s2= new String("World");//new Operator--> in both Heap* and SCP
		
		char ch[]= {'J','a','v','a'};
		String s3= new String(ch);//Java
		
		
		//1. concat method
		
		s1=s1.concat(" World");// Hello World--> new object SCP
		System.out.println(s1);//Hello
		
		//EQUALS
		//1. equals(), 2, compareTo() 3.==
		
		String str1="Java"; //scp
		String str2="Java";//scp
		String str3=new String("java"); //Heap *,
		String str4="Python";
		
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str2.equals(str3));//false
		System.out.println(str2.equals(str4));//false
		
		System.out.println(str1==str2);//true
		System.out.println(str2==str3);//false
		
		//	first s1 and second s2 objects
		// s1 == s2  ==> 0
		//s1>s2 : postive value Example:1
		//s1<s2 : Negative Value eExample:-1
		
		
		String st1="Ram";
		String st2="Krish";
		String st3="Ram";
		System.out.println(st1.compareTo(st2));//7
		System.out.println(st1.compareTo(st3));//0
		System.out.println(st2.compareTo(st3));//-7
		
		String t1="hello";
		String t2="hello";
		String t3="melko";
		String t4="helmo";
		String t5="flag";
		
		System.out.println(t1.compareTo(t2));//0 because both are equal
		System.out.println(t1.compareTo(t3));//-5 because "h" is 5 times lower than "m"
		System.out.println(t1.compareTo(t4));//-1 because "l" is 1 times lower than "m"
		System.out.println(t1.compareTo(t5));//2 because "h" is 2 times greater than "f"
		
		
		//+ use for two string concatination
		
		String str5="Hello"+" world"+1+" Java"+2;
		// String s = (new StringBuilder()).append("Hello").append(" world").append(1).append(" Java").append(2).toString();
		System.out.println(str5);
		
		
		String str11="hello";//he==>char[] ch={'h','e','l','l','o'}
		           // 01234  Index
		System.out.println(str11.substring(0, 2));     //lo  //
		
		System.out.println(str11.substring(2,4));  //ll 
		
		System.out.println(str11.substring(1, 5)); //ello
		
		System.out.println(str11.substring(1,2));
		
		
		String str12="   Java   "; //lowercase
		System.out.println(str12.toUpperCase());// JAVA
		System.out.println(str12.toLowerCase());//java
		
		System.out.println(str12.trim());
		
		String str13="Sachin";
		            //012345
		System.out.println(str13.startsWith("Sa"));
		System.out.println(str13.endsWith("n"));
		
		//charAt(Int Index)
		
		System.out.println(str13.charAt(4));//S
		
		System.out.println(str13.length());
		
		System.out.println(str13.substring(3, (str13.length())));
		
		int i=10;
		String str14=""+i;
		str14=str14.valueOf(i);
		
		//replace()
		
		String str15="Java is a programming Language. Java is platform independet";
		
		System.out.println(str15.replace('J', 'j'));
		System.out.println(str15.replace("Java", "Kava"));
		
		
		String str16="Hello,java,Programming";
		String[] strArr=str16.split(",");
		for(int j=0;j<strArr.length;j++)
		{
			System.out.println(strArr[j]);
		}
		
	}

}
