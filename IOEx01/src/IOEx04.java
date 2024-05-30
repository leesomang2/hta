import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			//fis = new FileInputStream("./test.txt");
			//bis = new BufferedInputStream(fis);//직접접으로 넣을수없음 파일자체를
			bis = new BufferedInputStream(new FileInputStream("./test.txt")); //이걸로도가능
			
			int data = 0;
			while(( data = bis.read()) != -1 ) {
				System.out.print( (char)data );
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		}finally {
			try {bis.close();} catch(IOException e) {}
			//try {fis.close();} catch(IOException e) {}
		}
		
		
	}

}
