import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// byte -> char 변환스트림 (다국어 처리
		InputStreamReader isr = null;
		
		//InputStream is = null;
		
		//프로그램 시작과 동시 생성
		try {
			isr = new InputStreamReader(System.in);
			
			System.out.print("입력 > ");
			System.out.println((char)isr.read());
			System.out.println((char)isr.read());
			System.out.println((char)isr.read());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			try {isr.close();}catch(IOException e) {}
		}
		
	}

}
