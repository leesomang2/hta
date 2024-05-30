import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NameDAO {
	private Connection conn;
	
	public NameDAO() {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "123456";
        
        try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}
    }
	
	public ArrayList<NameTO> searchName(String strEname){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<NameTO>addresses = new ArrayList<NameTO>();
		
		try {
			String sql = "select empno, ename, job, dname, loc from emp join dept on emp.deptno = dept.deptno where ename like ? group by empno, ename, job, dname, loc";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, strEname + "%");
			
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				NameTO to = new NameTO();
				to.setEmpno(rs.getString("empno"));
				to.setEname(rs.getString("ename"));
				to.setJob(rs.getString("job"));
				to.setDname(rs.getString("dname"));
				to.setLoc(rs.getString("loc"));
				
				addresses.add(to);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e1.getMessage());
		}finally {
			if (rs != null) try { rs.close(); } catch (SQLException e1) {}
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e1) {}
            if (conn != null) try { conn.close(); } catch (SQLException e1) {}
		}
		return addresses;
	}
	
}
