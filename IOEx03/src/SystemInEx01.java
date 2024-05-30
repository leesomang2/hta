import java.io.IOException;
import java.io.InputStream;

public class SystemInEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = null;
		
		//프로그램 시작과 동시 생성
		try {
			is = System.in;
			
			System.out.print("입력 > ");
			System.out.println((char)is.read());
			System.out.println((char)is.read());
			System.out.println((char)is.read());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			try {is.close();}catch(IOException e) {}
		}
		
	}

}
