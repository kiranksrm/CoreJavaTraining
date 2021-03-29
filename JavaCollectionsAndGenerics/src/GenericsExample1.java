/**
 * 
 * @author vinod
 *
 * @param <P>
 */
public class GenericsExample1<P> { //T --Type of Parameter

	P obj;   //T --> String, Integer, Userdefined Object.
	
	void add(P obj)
	{
		this.obj=obj;
	}
	
	P get()
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
