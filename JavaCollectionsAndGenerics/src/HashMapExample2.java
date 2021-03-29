import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map= new HashMap<Integer,String>();
		map.put(new Integer(10), "ABC");
		map.put(new Integer(20), "XYZ");
		System.out.println(map);
		
		for(Map.Entry<Integer, String> m: map.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}
		
		System.out.println("######");
		
		Set<Integer> keySet=map.keySet();
		for(Integer key: keySet)
		{
		 System.out.println("Key:"+key+", Value:"+map.get(key));	
		}
		
		
	}
}
