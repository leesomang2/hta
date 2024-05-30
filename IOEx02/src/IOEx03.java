import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//2차 스트림을 사용      속도가 빠름
		BufferedOutputStream bos = null;
		
		
		try { //파일이 없으면 새로 생성하면서 진행
			//기본용량 8192 
			//bos = new BufferedOutputStream(new FileOutputStream("./test1.txt"));
			
			//용량 1024로 넣어준거
			bos = new BufferedOutputStream(new FileOutputStream("./test1.txt"),1024);
			
			
			bos.write('a');
			bos.write('b');
			bos.write('\n');
			
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {bos.close();} catch(IOException e) {}
		}
		
	}

}
