
public class GenericMethodExample {
	
	
	public static<E> void PrintArray(E[] elements)
	{
		for(E element: elements)
		{
			System.out.print(element+",");
		}
		System.out.println();
	}
	
	//public static<Integer> void printArray(Integer[] elements)
	//{
	// for(Integer element: elemements)
	// {
	//   Syso(element);
	// }
	//}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray= {10,20,30,40};
		Character[] chArr= {'A','B','C','D'};
		
		System.out.println("Printing Integer Array");
		PrintArray(intArray);
		
		System.out.println("Printing Char array");
		PrintArray(chArr);

	}

}
