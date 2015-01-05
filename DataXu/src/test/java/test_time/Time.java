package test_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Time {

	public static void main(String[] args) {
		String beginDate="1416805199000";

		SimpleDateFormat sdf=new SimpleDateFormat("dd\\MMM\\YYYY:HH:mm:ss Z",Locale.UK);

		String sd = sdf.format(new Date(Long.parseLong(beginDate)));
		System.out.println(sd);
	}

}
