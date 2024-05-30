import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("./image1.jpeg");
			fos = new FileOutputStream("./image2.jpeg");
			
			int data = 0 ;
			while((data = fis.read() ) != -1) {
				fos.write(data);
			}
			
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			try {fos.close();} catch(IOException e) {}
			try {fis.close();} catch(IOException e) {}
		}
				
		
	}

}
