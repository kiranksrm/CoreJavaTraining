
public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb= new StringBuilder("Hello");
		sb.append(" World");
		
		System.out.println(sb);
		
		StringBuilder sb1= new StringBuilder("Hello");
		sb.append(" World");
		
		System.out.println(sb.equals(sb1));
	}

}
