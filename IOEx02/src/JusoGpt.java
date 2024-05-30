import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JusoGpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 검색어가 입력되지 않았거나 길이가 2자 미만인 경우 프로그램 종료
        if (args.length == 0 || args[0].length() < 2) {
            System.out.println("검색어를 2자 이상 입력하세요.");
            return;
        }
        
        // 검색어
        String searchTerm = args[0];
        
        String fileName = "./zipcode_seoul_utf8_type2.csv"; // 파일 경로를 적절히 수정하세요

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // 파일을 한 줄씩 읽어서 검색어와 일치하는 줄을 출력
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchTerm)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }

	}

}
