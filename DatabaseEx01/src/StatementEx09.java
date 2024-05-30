import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("시작");

		String url = "jdbc:mariadb://localhost:3306/sample"; 
		String user = "root"; 
		String password = "123456"; 

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 데이터베이스 연결을 위한 데이터베이스 드라이버 로딩
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");

			// 접속
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공");

			stmt = conn.createStatement();

			
			String sql = "select * from emp";
			rs = stmt.executeQuery(sql);
			
			//커서의이동
			//rs.next()한칸아래로이동
			//rs.absolute(행번호)
			//rs.beforeFirst() - 커서 위치를 초기화
			//rs.first() 첫번째 
			//rs.last() 마지막
			//rs.previous() 한칸전데이터
			
			rs.absolute(1);//커서 번째 1번째 출력
			System.out.printf("%s\t%s%n",rs.getString("empno"),rs.getString("ename"));
			
			rs.absolute(10); //커서 번째 10번째출력
			System.out.printf("%s\t%s%n",rs.getString("empno"),rs.getString("ename"));
			
			rs.previous();//커서 이전 이전꺼 출력
			System.out.printf("%s\t%s%n",rs.getString("empno"),rs.getString("ename"));
			
			rs.next();//커서 다음꺼  다음꺼출력
			System.out.printf("%s\t%s%n",rs.getString("empno"),rs.getString("ename"));
			
			rs.last(); //커서 마지막  마지막출력
			System.out.printf("%s\t%s%n",rs.getString("empno"),rs.getString("ename"));
			
			System.out.println(rs.getRow());//데이터 갯수확인 프로그램
			// select count(*) from 테이블명 //데이터 갯수확인sql문
			
			//커서초기화 첨위치로
			rs.beforeFirst();
			
			rs.next(); //커서 다음 첫번째 문장출력
			System.out.printf("%s\t%s%n",rs.getString("empno"),rs.getString("ename"));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} finally {
			if (rs != null)try {rs.close();} catch (SQLException e) {}
			if (stmt != null)try {stmt.close();} catch (SQLException e) {}
			if (conn != null)try {conn.close();} catch (SQLException e) {}
		}

		System.out.println("끝");
	}

}
