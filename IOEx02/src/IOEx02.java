import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileOutputStream fos = null;
		OutputStream fos = null;
		
		try { //파일이 없으면 새로 생성하면서 진행 / 있으면 오버라이팅(지우고다시만듬)
			fos = new FileOutputStream("./test1.txt");
			
			//append mode 추가모드  true
			//fos = new FileOutputStream("./test1.txt", true);
			
			fos.write('a');
			fos.write('b');
			fos.write('\n');
			
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {fos.close();} catch(IOException e) {}
		}
		
	}

}
