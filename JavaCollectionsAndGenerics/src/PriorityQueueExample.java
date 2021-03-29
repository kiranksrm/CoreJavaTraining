import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p = new PriorityQueue();
		p.add("Hello1");
		p.add("Hello2");
		p.add("Hello3");
		p.add("Hello4");
		
		Iterator it= p.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
