import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BackEx01 {

    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "123456";
        
        Connection conn = null;
        PreparedStatement pstmt1 = null; // select
        PreparedStatement pstmt2 = null; // insert
        ResultSet rs = null;
        
        try {
            // JDBC 드라이버 로드
            Class.forName("org.mariadb.jdbc.Driver");
            // 데이터베이스 연결
            conn = DriverManager.getConnection(url, user, password);
            
            // SELECT 쿼리 준비
            String selectSQL = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where deptno = 10";
            pstmt1 = conn.prepareStatement(selectSQL);
            rs = pstmt1.executeQuery();
            
            // INSERT 쿼리 준비
            String insertSQL = "insert into emp_10 values (?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt2 = conn.prepareStatement(insertSQL);
            
            while(rs.next()) {
                // 데이터 추출
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                String hiredate = rs.getString("hiredate");
                double sal = rs.getDouble("sal");
                double comm = rs.getDouble("comm");
                int deptno = rs.getInt("deptno");
                
                // INSERT 쿼리에 값 설정
                pstmt2.setInt(1, empno);
                pstmt2.setString(2, ename);
                pstmt2.setString(3, job);
                pstmt2.setInt(4, mgr);
                pstmt2.setString(5, hiredate);
                pstmt2.setDouble(6, sal);
                pstmt2.setDouble(7, comm);
                pstmt2.setInt(8, deptno);
                
                // INSERT 쿼리 실행
                pstmt2.executeUpdate();
            }
            
            System.out.println("백업 완료");
        } catch (ClassNotFoundException e) {
            // JDBC 드라이버 로드 실패 시 에러 메시지 출력
            System.out.println("[에러]" + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            // SQL 실행 도중 에러 발생 시 에러 메시지 출력
            e.printStackTrace();
            System.out.println("[에러]" + e.getMessage());
        } finally {
            // 자원 해제
            if(rs != null) try { rs.close(); } catch(SQLException e) {}
            if(pstmt2 != null) try { pstmt2.close(); } catch(SQLException e) {}
            if(pstmt1 != null) try { pstmt1.close(); } catch(SQLException e) {}
            if(conn != null) try { conn.close(); } catch(SQLException e) {}
        }
    }
}
