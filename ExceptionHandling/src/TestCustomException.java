
public class TestCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		
	}
	static void validate(int age)
	{
		if(age<18)
		{
			throw new InValidAgeException(123,"Not eligible");
		}
		else
			System.out.println("Eligible");
	}

}
