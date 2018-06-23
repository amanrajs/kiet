package June22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo4 {

		public static void main(String[] args) throws ParseException {
			
			
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date dt = sdf.parse("22-06-2018");
			
		}
}
