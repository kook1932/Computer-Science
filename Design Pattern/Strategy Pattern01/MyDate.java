import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;

// String���� ���� ��¥ ������ Date ��ü�� ��ȯ�ϴ� Ŭ����
public class MyDate {
	public static Date creMyDate(String dateStrings)
	{
		SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date dates = new Date();
		dates = dateTime.parse(dateStrings,new ParsePosition(0));
		return dates;
	}
}