import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;

// String으로 받은 날짜 형식을 Date 객체로 반환하는 클래스
public class MyDate {
	public static Date creMyDate(String dateStrings)
	{
		SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date dates = new Date();
		dates = dateTime.parse(dateStrings,new ParsePosition(0));
		return dates;
	}
}
