package collectiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DateList {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Date> birthdays = new ArrayList<>();
		
		birthdays.add(sdf.parse("19-06-1999"));
		birthdays.add(sdf.parse("08-01-1993"));
		birthdays.add(sdf.parse("12-12-1985"));
		birthdays.add(sdf.parse("10-11-2001"));
		birthdays.add(sdf.parse("18-03-1997"));
		
		Collections.sort(birthdays);
		for(Date dt : birthdays) {
			System.out.println(sdf.format(dt));
		}
		
	}
}
