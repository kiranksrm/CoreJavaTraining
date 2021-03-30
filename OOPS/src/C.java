class A {
		
	A()
	{
		
	}
	
//	A(int i) {
//		System.out.println("A");
//	}
}

class B extends A {
	B()
	{
		//super();
	}
	B(int i)
 {
		//super(); JVM added default
		//super(10);//Calling the super class Arg constructor
  System.out.println("B");
 }
}

public class C {
public static void main(String args[])
{
 B b=new B(10);//A B
 
 B b1 =new B();
  
 A a =new A(20);//A
}
}