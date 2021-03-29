import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer2> list = new ArrayList<>();
		Customer2 c1= new Customer2();
		c1.setName("Arun");
		c1.setId(103);
		c1.setSal(1000);
		
		Customer2 c2= new Customer2();
		c2.setName("Vikranth");
		c2.setId(101);
		c2.setSal(2000);
		
		Customer2 c3 = new Customer2();
		c3.setName("Sachin");
		c3.setId(102);
		c3.setSal(3000);
		
		Customer2 c4 = new Customer2();
		c4.setName("Sachin");
		c4.setId(105);
		c4.setSal(3000);
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		Collections.sort(list, new Customer2());
		for(Customer2 c:list)
		{
			System.out.println(c.getId()+" "+c.getName()+" "+c.getSal());
		}
	}

}
