import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//IO
		//stream
		//1차 스트림
		//      byte기반             -XXXInputStream / XXXOutstream
		//      다국어 이외에 모든 문자를 저장- File기반 저장 / 바이너리 -이미지 , 실행파일, 음악..
		
		//		charactor 기반       -XXXReader / XXXWriter
		//      다국어 포함한 모든 문자를 저장 -File기반 저장
		//2차 (보조)스트림
		
		File file = new File("./test.txt");
		System.out.println(file.exists());
	
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./test.txt");
			
			//byte단위
			int data = fis.read();
			System.out.println((char)data);
			
			data = fis.read();
			System.out.println((char)data);
			
			data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" [에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" [에러] " + e.getMessage());
		}finally {}
		try {fis.close();} catch(IOException e) {}
	}
	
	
	
	

}
