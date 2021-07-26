import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map= new HashMap(); 
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put(null, null);
		
		System.out.println(map);
		
		//1. using KeySet(), get() 
		Set keySet=map.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext())
		{
			String key= (String) it.next();
			System.out.println("Key= "+key+", Value="+map.get(key));
		}
		
		//2. using entrySet()
		Set entrySet=map.entrySet();
		Iterator it1= entrySet.iterator();
		while(it1.hasNext())
		{
			Map.Entry entry= (Map.Entry) it1.next();
			System.out.println("---> Key="+entry.getKey()+", Value="+entry.getValue());;
		}
		
		//3. get all Values
		Collection mapValues=map.values();
		Iterator it2=mapValues.iterator();
		while(it2.hasNext())
		{
			Integer i= (Integer)it2.next();
			System.out.println(i);
		}
		
	}

}
