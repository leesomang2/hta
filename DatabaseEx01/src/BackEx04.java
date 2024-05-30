import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BackEx04 {

    public static void main(String[] args) {
        // 데이터베이스 연결 정보 설정
        String url = "jdbc:mariadb://localhost:3306/project"; // 데이터베이스 URL
        String user = "project"; // 데이터베이스 사용자 이름
        String password = "123456"; // 데이터베이스 비밀번호
        
        Connection conn = null; // 데이터베이스 연결 객체
        PreparedStatement pstmt = null; // SQL 문 실행을 위한 준비된 문 객체
        ResultSet rs = null; // 쿼리 결과 집합을 담는 객체
        
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        System.out.println("검색할 동 이름을 입력하세요: "); // 사용자에게 검색할 동 이름을 입력하라는 메시지 출력
        String dong = scanner.nextLine(); // 사용자로부터 동 이름 입력 받음
        
        try {
            // MariaDB JDBC 드라이버 로드
            Class.forName("org.mariadb.jdbc.Driver");
            // 데이터베이스에 연결
            conn = DriverManager.getConnection(url, user, password);

            // SQL 쿼리 작성
            String searchSQL = "SELECT zipcode, sido, gugun, dong, ri, bunji FROM zipcode WHERE dong LIKE ?";
            pstmt = conn.prepareStatement(searchSQL); // PreparedStatement 객체 생성
            pstmt.setString(1, "%" + dong + "%"); // 동 이름을 포함하는 데이터를 찾기 위해 LIKE 연산자를 사용하고, 동적으로 입력된 동 이름에 '%'를 붙여줌

            // SQL 쿼리 실행
            rs = pstmt.executeQuery(); // SQL 쿼리 실행 및 결과를 ResultSet에 저장

            // 결과 출력
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "우편번호", "시도", "구군", "동", "리", "번지"); // 결과 출력 포맷 지정
            System.out.println("-----------------------------------------------------------");
            while (rs.next()) {
                // 각 열의 데이터를 가져와서 출력
                String zipcode = rs.getString("zipcode");
                String sido = rs.getString("sido");
                String gugun = rs.getString("gugun");
                String dongResult = rs.getString("dong");
                String ri = rs.getString("ri");
                String bunji = rs.getString("bunji");

                // 결과 출력
                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", zipcode, sido, gugun, dongResult, ri, bunji);
            }
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // JDBC 드라이버를 찾지 못할 때 발생하는 예외 처리
        } catch (SQLException e) {
            e.printStackTrace(); // SQL 예외 처리
        } finally {
            // 자원 해제
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); } // ResultSet 해제
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } // PreparedStatement 해제
            if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } // Connection 해제
            scanner.close(); // Scanner 해제
        }
    }
}