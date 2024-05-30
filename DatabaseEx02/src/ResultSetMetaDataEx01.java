import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "123456";	
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			
			System.out.println(rsmd.getTableName(1));
			
			//번호가 컬럼순서
			System.out.println(rsmd.getColumnName(1));
			
			//전체출력
			for(int i =1 ; i<=rsmd.getColumnCount(); i++) {
				System.out.println(rsmd.getColumnName(i));
				System.out.println(rsmd.getColumnTypeName(i));
				
				System.out.println(rsmd.getPrecision(i));
				System.out.println(rsmd.getScale(i));
				
				System.out.println(rsmd.isNullable(i)); //null허용확인
				
				
				}System.out.println("+-------+-----------------+");
				 System.out.println("|Field  |Type        |null|");
				 System.out.println("+-------+-----------------+");
			for(int i =1 ; i<=rsmd.getColumnCount(); i++) {
				System.out.printf("| %s\t |  %s  | (%s)|",
						rsmd.getColumnName(i),rsmd.getColumnTypeName(i),rsmd.getPrecision(i));
				System.out.println();
			}	System.out.println("+-------+-----------------+");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			if(rs != null) try {rs.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
		}
	}

}
