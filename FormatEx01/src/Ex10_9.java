import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2024년 05월 13일");
			System.out.println(df2.format(d));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
