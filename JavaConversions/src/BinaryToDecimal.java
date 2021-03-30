
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10100";
		int decimal= Integer.parseInt(str, 2);
		System.out.println(decimal);
		
		decimal = Integer.parseInt(str, 8);
		System.out.println(decimal);
		
		decimal = Integer.parseInt(str, 16);
				System.out.println(decimal);
	}

}
