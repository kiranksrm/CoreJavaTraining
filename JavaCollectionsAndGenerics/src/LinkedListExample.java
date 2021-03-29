import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		
		ll.add("Hello");
		ll.add(new Integer(10));
		ll.add(10);
		ll.add(10);
		ll.add(new LinkedListExample());
		
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
