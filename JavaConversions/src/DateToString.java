import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		Date d = new Date();
		//1. yyyy-MM-dd
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss z");
		String str=sdf.format(d);
		System.out.println(str);
		
		
		Date d1=Calendar.getInstance().getTime();
		
	}

}
