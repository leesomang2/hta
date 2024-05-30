import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			if(args.length != 1) { //비정상 입력시 출력 할 문구
				System.out.println("회차 정보를 입력하세요");
				System.exit( 0 );
				
			}
			String csvFile = "C:\\java\\java-workspace\\DatabaseEx02\\zipcode_seoul_utf8_type2.csv";
	        String line;
	        String csvSplitBy = ",";
			
			// 정상 입력 
			String url = "jdbc:mariadb://localhost:3306/project";
			String user = "project";
			String password = "123456";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			Stirng insertSQL = "insert into lottotbl(seq, n1, n2, n3, n4, n5, n6, n7, wdate) values (?,?,?,?,?,?,?,?,?,) )";
			pstmt = conn.prepareStatement(insertSQL);
	}

}
