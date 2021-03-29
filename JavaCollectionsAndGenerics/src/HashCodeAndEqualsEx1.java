import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualsEx1 {
	

	public static void main(String[] args) throws CloneNotSupportedException {
		
		User u1 = new User("Kiran",7);
		User u2 = new User("Kiran",7);
		User u3=(User)u1.clone(); //Shallow cloning or Deep cloning
		//User u3=u1;  //u1. u
		
		System.out.println(u1);
		System.out.println(u2);
		
//		if(u1==u2)
//		{
//			System.out.println("True");
//		}
//		else
//			System.out.println("False");
//		
//		if(u1.equals(u2))
//		{
//			System.out.println("Objects are equal.");
//		}
//		else
//			System.out.println("Object are not equal");
		
		Map<User, String> userMap=new HashMap<User, String>();
		userMap.put(u1, "ABC");
		userMap.put(u2, "XYZ");
		
		for(User user: userMap.keySet())
		{
			System.out.println(userMap.get(user).toString());
		}
	}

}
