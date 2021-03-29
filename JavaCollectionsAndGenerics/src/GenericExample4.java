import java.util.ArrayList;
import java.util.List;

public class GenericExample4 {
	
	//Generic method example
	public static void drawShapes(List<? extends Shape> lists)
	{
		for(Shape s: lists)
		{
			s.draw();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Rectangle> recList= new ArrayList<Rectangle>();
		recList.add(new Rectangle());
		
		List<Circle> cirList= new ArrayList<>();
		cirList.add(new Circle());
		cirList.add(new Circle());
		
		List<Shape> list=new ArrayList<>();
		list.add(new Circle());
		
		drawShapes(recList);
		
		drawShapes(cirList);
		
		drawShapes(list);

	}

}
