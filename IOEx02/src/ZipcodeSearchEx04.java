import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZipcodeSearchEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너로 입력받아 동검색후 q가 나오면 종료 
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		System.out.println("동을 입력하세요");
		String s1 = sc.nextLine();
		
		
		
		if( s1.equals("q")){
			System.out.println("프로그램종료");
			
		}else {
			   BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			String line = null;
			while(( line = br.readLine()) != null) {
				//전체 데이터 출력
				//System.out.println(line);
				String[] addresses = line.split(",");
				//System.out.println(addresses[3]);
				
				if(addresses[3].startsWith( s1 )){
					System.out.printf("[%s] %s %s %s %s %s%n",
							addresses[0],addresses[1],addresses[2],
							addresses[3],addresses[4],addresses[5]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {br.close();} catch(IOException e) {}
		}
		}
		}
	}

}
