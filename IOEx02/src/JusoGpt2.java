import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JusoGpt2 {

	public static void main(String[] args) {
		 // 명령행 매개변수로 검색어를 입력받아야 함
        if (args.length == 0 || args[0].length() < 2) { // 검색어가 없거나 2자 미만이면 프로그램 종료
            System.out.println("검색어를 2자 이상 입력하세요.");
            return;
        }
        
        // 검색어
        String searchTerm = args[0];
        
        // 파일 경로
        String fileName = "./zipcode_seoul_utf8_type2.csv"; // 파일 경로를 적절히 수정하세요

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // 파일을 한 줄씩 읽어서 검색어와 일치하는 줄을 출력
            while ((line = reader.readLine()) != null) {
                
            	// 검색어가 포함된 줄인지 확인
                if (line.contains(searchTerm)) { //contains 지정문자가 있는지 확인할때사용
                    // 필요한 포맷에 맞게 출력
                    String[] parts = line.split(",");
                    System.out.print("[" +parts[0]+"] ");// [477-853] 출력
                    //System.out.print(parts[0]); // [477-853] 출력
                    //System.out.print("] ");
                    // parts 배열의 첫 번째 이후의 요소들을 공백으로 구분하여 출력
                    for (int i = 1; i < parts.length; i++) {
                        System.out.print(parts[i]);
                        if (i < parts.length - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(); // 줄바꿈
                }
            }
        } catch (IOException e) { // 파일 읽기 중 오류 처리
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
	}

}
