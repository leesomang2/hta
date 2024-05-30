import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		
		
		try {
			//FileOutputStream  - 파일이 없으면 자동생성 / 파일이 있으면 재생성(초기화)
			fos = new FileOutputStream("./test2.txt");
			
			fos.write('1');
			fos.write('2');
			fos.write('\n');
			fos.write('1');
			fos.write('2');
			
			System.out.println("출력 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}
		finally{
			try {fos.close();} catch(IOException e) {}
		}
		
		
	}

}
