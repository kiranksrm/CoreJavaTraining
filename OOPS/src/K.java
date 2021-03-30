
class I
{
	//I(){}  //JVM
	int i, j;
	I(int i)
	{
		System.out.println("Inside I()");
	}
	
}


class J  extends I
{
	//J(){super();}//JVM
	
	J(int k)
	{
		super(10);
		//super();//dummy  
		//super.i, super.j,super(20), super(20,30)
		//super.getName(); super.setName();
		System.out.println("Inside J()");
		
		//S
	}
}


public class K {
//K(){} //JVM
	public static void main(String[] args) {
   
		I i=new I(10);// Inside A()
		
		J j=new J(20);//
		
		
	}

}
