import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map= new HashMap();
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		
		map.put("3", null);//try insert duplicate (override the key value)
		map.put(null, null);
		
		//map.put(null, null);
		map.replace("3", "P");
		
				
		HashMapExample1 h1=new HashMapExample1();
		HashMapExample1 h2=new HashMapExample1();
		HashMapExample1 h3=new HashMapExample1();
		HashMapExample1 h4=new HashMapExample1();
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
//		System.out.println(map.get("1"));
//		System.out.println(map.get("2"));
//		System.out.println(map.get("3"));
//		System.out.println(map.get(null));
		
		Set entrySet=map.entrySet();//converting to the Set so that I can iterate
		Iterator it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			if(map.containsKey("2"))
			{
				
			}
			System.out.println("Key= "+entry.getKey()+", Value="+entry.getValue());
			
		}
		System.out.println("#################");
		Set keySet=map.keySet();
		Iterator it1=keySet.iterator();
		while(it1.hasNext())
		{
			String key= (String)it1.next();
			System.out.println("Key= "+key+", Value="+map.get(key));
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1234;
	}

}
