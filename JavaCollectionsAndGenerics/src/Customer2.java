import java.util.Comparator;

public class Customer2 implements Comparator{

	int id;
	String name;
	int sal;
	
	public Customer2()
	{
		
	}
	public Customer2(int id, String name, int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Customer2 c1= (Customer2) o1;
		Customer2 c2=(Customer2) o2;
		
		if(c1.getSal()==c2.getSal() && (c1.getName().equalsIgnoreCase(c2.getName())))
			return 0;
		else if (c1.getSal()>c2.getSal() && (c1.getName().equalsIgnoreCase(c2.getName())))
			return 1;
		else
			return -1;
		
	}
	
	@Override
public boolean equals(Object obj)
	{
		return false;
		
	}

	@Override
	public int hashCode()
	{
		return 0;
	}
	
	
	
	
	
}
