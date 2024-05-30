import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileInputStream 
		//FileInputStream fis = null;
		InputStream fis = null; //상속관계라 가능
		
		try {
			// 반드시 파일이 존재해야한다.
			fis = new FileInputStream("./test1.txt"); 
			
			int data = 0 ;
			while(( data = fis.read() ) != -1 ) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {fis.close();} catch(IOException e) {}
		}
	}

}
