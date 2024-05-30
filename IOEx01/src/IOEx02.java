import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./test.txt");
			
			int data = 0;
			
			//다국어는 읽지못함 엔터키탭키도 문자  다읽음
			while((data = fis.read()) != -1 ) { //파일 끝까지
				//System.out.println((char)data);
				//System.out.print((char)data);
				//  \n 엔터키 
				
				//window 엔터키 - \r\n
				//다른 os - \n
				if(data == '\r') {
					System.out.print("(r)");
				}else {
					System.out.print((char)data);
				}
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {fis.close(); } catch(IOException e) {}
		}
	}

}
