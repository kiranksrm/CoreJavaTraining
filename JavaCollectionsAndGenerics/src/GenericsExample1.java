/**
 * 
 * @author vinod
 *
 * @param <P>
 */
public class GenericsExample1<T> { //T --Type of Parameter

	T obj;   //T --> String, Integer, Userdefined Object.
	
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return this.obj;
	}
	
	
	//class GenericExample1<String>
	//{
	//  String obj;
	//  void add(String obj)
	//   {
	//     this.obj=obj;
	//   }
	//  String get()
	//  {
	//   return this.obj;
	//  }
	//}
	
}
