import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10);//duplicate
		hs.add("Hello");
		hs.add(10.00);
		hs.add(new HashSetExample());
		hs.add(null);
		hs.add(null);
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		HashSet h1= new HashSet();
		h1.add(20);
		
		hs.add(h1);
		hs.removeAll(h1);
	}

}
