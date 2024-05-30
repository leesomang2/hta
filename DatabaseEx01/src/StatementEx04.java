import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 버전2
		System.out.println("시작");

		// 데이터베이스 연결 url id password
		String url = "jdbc:mariadb://localhost:3306/sample"; // jdbc:mariadb: 여기까진 고정 ip port 데이터베이스명
		String user = "root"; // 설정
		String password = "123456"; // 설정

		Connection conn = null;
		Statement stmt = null;

		// 데이터베이스 연결을 위한 데이터베이스 드라이버 로딩
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");

			// 접속
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공");

			stmt = conn.createStatement();

			String sql = String.format("create table testtbl (col1 varchar(10))");
			//System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			
			System.out.println("생성 완료 :"+ result);

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}

		System.out.println("끝");
	}

}
