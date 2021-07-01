import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer
   {
    private int id;
	private String name;
	private int age;
	
	public Customer(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
  }

public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers= new ArrayList<>();
		
		customers.add(new Customer(1, "Java", 10));
		customers.add(new Customer(2, "C", 20));
		customers.add(new Customer(3, "Python",5));
		customers.add(new Customer(3, "Power BI",5));
		customers.add(new Customer(3, "Hadoop",5));
		
		System.out.println("Before Sorting");
		for(Customer c: customers)
		{
			System.out.println(c.getName());
		}
		
		Collections.sort(customers, new Comparator<Customer>() {
			public int compare(Customer c1, Customer c2) {
				int comp=c1.getAge()-c2.getAge();
				if(comp!=0)
				{
					return comp;
				}
				return c1.getName().compareTo(c2.getName());
			}
		});
		
		System.out.println("After Sorting");
		for(Customer c: customers)
		System.out.println(c.getName());

	}

}
