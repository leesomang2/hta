import java.text.DecimalFormat;
import java.text.ParseException;

public class FormatEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNum = "$1,234.5"; 
		
		//double d = Double.parseDouble(strNum);
		//System.out.println( d );
		
		DecimalFormat format = new DecimalFormat("$#,###.");
		
		try {
		double d = (double)format.parse( strNum );//unhandled 뜨면 예외처리 Exception
		System.out.println( d );
		}catch(ParseException e){
			e.printStackTrace();
			
		}
		
		}

}
