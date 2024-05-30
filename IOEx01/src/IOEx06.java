import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr = null ;
		//다국어 지원
		try {
			fr = new FileReader("./test.txt");
			
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {fr.close();} catch(IOException e) {}
		}
	}

}
