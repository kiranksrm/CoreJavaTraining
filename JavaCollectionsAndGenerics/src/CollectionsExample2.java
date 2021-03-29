import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person(2, "Kiran", "Bangalore");
		Person p2= new Person(1, "Ram","Hyderbad");
		
		List<Person> list= new ArrayList<>();
		list.add(p1);
		list.add(p2);
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext())
		{
			Person p=(Person)it.next();
			System.out.println(p.getId());
		}
		
		Collections.sort(list,Collections.reverseOrder());
		it = list.iterator();
		while(it.hasNext())
		{
			Person p=(Person)it.next();
			System.out.println(p.getId());
		}
		
	}

}
