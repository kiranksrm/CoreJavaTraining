public class C1
{
  private String companyName="ibm";//Instance Variable

  C1()
  {
	  super();
  }
  //C1(){}
  
  public void C1()
  {
	  System.out.println("inside c1() method");
  }
  
 public void C1(String companyName) // not a constructor, it is a method
 {
  this.companyName=companyName;
 }


public static void main(String[] args)
 {
  C1 c=new C1();  //no compile time error since Java complier ading default constructor
  System.out.println(c.companyName);//ibm
 }

}