import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer2> list = new ArrayList<>();
		
		List<MyCustomer2> myList = new ArrayList<>();
		
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
		
		
		MyCustomer2 m1= new MyCustomer2();
		m1.setId(1001);
		m1.setName("MyCustomer1");
		m1.setSal(2000);
		
		MyCustomer2 m2= new MyCustomer2();
		m2.setId(1001);
		m2.setName("MyCustomer1");
		m2.setSal(2000);
		
		myList.add(m1);
		myList.add(m2);
		
		Collections.sort(list, new Customer2());
		for(Customer2 c:list)
		{
			System.out.println(c.getId()+" "+c.getName()+" "+c.getSal());
		}
		
		Collections.sort(myList, new Comparator<MyCustomer2>() {

			@Override
			public int compare(MyCustomer2 o1, MyCustomer2 o2) {
				if(o1.getSal()==o2.getSal())
				  return 0;
				else if(o1.getSal()>o2.getSal())
					return 1;
				else
					return -1;
			}
		});
		for(MyCustomer2 c:myList)
		{
			System.out.println(c.getId()+" "+c.getName()+" "+c.getSal());
		}
	}

}
