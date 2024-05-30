import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = null;
		//InputStreamReader isr = null;
		
		//InputStream is = null;
		
		//프로그램 시작과 동시 생성
		//Scanner
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력 > ");
			//System.out.println((char)br.read());
			//System.out.println((char)br.read());
			//System.out.println((char)br.read());
			System.out.println(br.readLine());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			try {br.close();}catch(IOException e) {}
		}
		
	}

}
