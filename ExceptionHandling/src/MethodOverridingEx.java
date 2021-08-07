import java.io.IOException;

class Parent
{
	protected void msg() throws RuntimeException
	{
		System.out.println("Parent msg method");
	}
}
class Child extends Parent
{
	public void msg() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Child msg method");
	}
}



//private < default < protected < public 
//Unchecked Exception --> parent class method always must throw parent class exception
//                      but child class overriden method must throw the same or child class exception objects

public class MethodOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
