import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer1> list= new ArrayList<Customer1>();
		Customer1 c1= new Customer1();
		c1.setName("Arun");
		c1.setId(103);
		c1.setSal(3000);
		
		Customer1 c2= new Customer1();
		c2.setName("Vikranth");
		c2.setId(101);
		c2.setSal(2000);
		
		Customer1 c3 = new Customer1();
		c3.setName("Sachin");
		c3.setId(102);
		c3.setSal(1000);
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		for(Customer1 c:list)
		{
			System.out.println(c.getId()+" "+c.getName()+" "+c.getSal());
		}
		System.out.println("##############");
		Collections.sort(list);
		for(Customer1 c:list)
		{
			System.out.println(c.getId()+" "+c.getName()+" "+c.getSal());
		}
		System.out.println("@@@@@@@");
		Collections.sort(list,Collections.reverseOrder());
		for(Customer1 c:list)
		{
			System.out.println(c.getId()+" "+c.getName()+" "+c.getSal());
		}
		
	}

}
