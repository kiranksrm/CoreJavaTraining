
public class C3 extends C2 {

	public void welcome()
	{
		System.out.println("inside c3");
	}
	
	public void welcome2()
	{
		System.out.println("Welcome 2");
	}
	public static void main(String[] args)
	{
		C2 c =new C3();
		c.welcome();
		c.welcome2();
	}
}
