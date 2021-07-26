import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> treeMap=new TreeMap<String, String>();
		treeMap.put("Java", "A");
		treeMap.put("C", "B");
		
		treeMap.put("Java", "C");
		
		//treeMap.put(null, null);
		
		System.out.println(treeMap);
		
		Hashtable<String, String> htable=new Hashtable<>();
		
		TreeMap<Integer,Person> t=new TreeMap<Integer,Person>();
		Person p1= new Person(1, "Ram", "Bangalore");
		Person pp1=new Person();
		pp1.setId(1);
		pp1.setName("Ram");
		pp1.setAddress("Bangalore");
		t.put(101, p1);
		t.put(102, pp1);
		
		for(Map.Entry<Integer, Person> m: t.entrySet())
		{
			System.out.println(m.getKey());
			Person p=(Person)m.getValue();
			System.out.println(p.getId()+","+p.getName()+","+p.getAddress());

		}
		
		String[] str= {"Aaaa","Aaa","Bvvv","Bvvv","Deee"};
		List<String> list=Arrays.asList(str);
		list=list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
