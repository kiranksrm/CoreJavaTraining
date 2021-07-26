import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualsEx2 {
	

	public static void main(String[] args) throws CloneNotSupportedException {
	
		MyCustomer2 m1= new MyCustomer2();
		m1.setId(1001);
		m1.setName("MyCustomer1");
		m1.setSal(2000);
		
		MyCustomer2 m2= new MyCustomer2();
		m2.setId(1001);
		m2.setName("MyCustomer1");
		m2.setSal(2000);
		
		if(m1.equals(m2))
		{
			System.out.println("Objects are Equal");
		}
		else
			System.out.println("Unequal..");
		
		if(m1==m2)
		{
			System.out.println("Equal");
		}
		else
			System.out.println("UnEqual..");
	}

}
