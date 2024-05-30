import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("시작");
		
		try {
			//데이터베이스 연결을 위한 데이터베이스 드라이버 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] 드라이버 로딩 실패");
			e.printStackTrace();
		}
		
		//데이터베이스 연결  url id password  
		String url = "jdbc:mariadb://localhost:3306/sample"; //jdbc:mariadb: 여기까진 고정 ip port 데이터베이스명
		String user = "root";   //설정
		String password = "123456";  //설정
		
		Connection conn = null;
		
		try {
			//접속
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
			e.printStackTrace();
		}finally {
			if(conn != null) try {conn.close(); } catch(SQLException e) {} //연결이되면 끊기게
		}
		
		System.out.println("끝");
	}

}
