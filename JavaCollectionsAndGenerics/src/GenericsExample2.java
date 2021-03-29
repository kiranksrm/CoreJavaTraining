import java.util.List;

public class GenericsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericsExample1<String> g = new GenericsExample1<>();
		g.add("Kiran");
		//g.add(new Integer(10));//Compile time error
		System.out.println(g.get());
		
		GenericsExample1<Integer> g1 = new GenericsExample1<>();
		GenericsExample1<User> g2= new GenericsExample1<>();
		GenericsExample1<Person> g3 = new GenericsExample1<>();
		
//		
//		T-- Type
//		E  -- Element
//		K --> Key
//		V-- Value
//		N -- Number
//		?  -- Question Mark (Wildcard symbol used in generics)
				
	}

}
