import java.io.FileNotFoundException;
import java.io.IOException;

class A1
{
  void display()
  {
	  System.out.println("A");
  }
  
  void getInfo() throws ArithmeticException
  {
	  System.out.println("A1");
  }
  
  void display1()
  {
	  System.out.println("A2");
  }
}

class B1 extends A1
{
  @Override
  public void display()
  {
	  System.out.println("B");
  }
  
  @Override  
  public  void getInfo() throws RuntimeException
  {
	  System.out.println("B1");
  }
}
public class MethodOverridingTest {

	public static void main(String[] args) throws Exception {
		A1 a = new A1();
		   a.display(); //A
		   a.getInfo(); // A1
		  
		  B1 b =new B1();
		   b.display(); //B
		   b.getInfo();//B1
		   
		  A1 a1 = new B1();
		     a1.display(); // B
			 a1.getInfo();// B1
			 a1.display1(); //A2
	}

}
