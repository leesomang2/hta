import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ZipcodeSearchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력값검사
		
		if ( args.length != 1) {
			System.out.println("java ZipcodeSearch 동이름");
			System.exit(0);
		}
		
		if ( args[0].length() < 2) {
			System.out.println("동이름을 두자이상 입력하세요");
			System.exit(0);
		}
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			String line = null;
			while(( line = br.readLine()) != null) {
				//전체 데이터 출력
				//System.out.println(line);
				String[] addresses = line.split(",");
				//System.out.println(addresses[3]);
				
				if(addresses[3].startsWith( args[0].trim() )){
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
