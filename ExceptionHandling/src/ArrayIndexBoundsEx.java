
public class ArrayIndexBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[5];
		
		try {
			
			a[10]=50;//ArrayIndexOUtofBoundsException
		}
		catch(NullPointerException np)
		{
			System.out.println("Inside finally");
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Inside finally....");
		}
		catch(Exception e)
		{
			System.out.println("Inside final Catch....");
		}
		finally
		{
			try
			{
				
			}catch(Exception e){}
			finally {
				
			}
		}

			
			System.out.println("Finished..");
		
	}

}
