import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,Person> map1=new HashMap<Integer, Person>();
		
		Person p1= new Person(1, "Ram", "Bangalore");
		
		Person pp1=new Person();
		pp1.setId(1);
		pp1.setName("Ram");
		pp1.setAddress("Bangalore");
		
		map1.put(new Integer(123), p1);
		map1.put(124, pp1);
		
		for(Map.Entry<Integer, Person> personSet: map1.entrySet())
		{
			System.out.println(personSet.getKey()+","+personSet.getValue());
			Person p=(Person)personSet.getValue();
			System.out.println(p.getId()+","+p.getName()+","+p.getAddress());
		}
		System.out.println("###############");
		Set<Integer> keySet=map1.keySet();
		Iterator<Integer> it=keySet.iterator();
		while(it.hasNext())
		{
			Integer key=it.next();
			Person p= (Person) map1.get(key);
			System.out.println("Key:"+key);
			System.out.println(p.getId()+","+p.getName()+","+p.getAddress());
		}
	}

}
