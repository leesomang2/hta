import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = null;
		
		try {
			
			bos = new BufferedOutputStream(new FileOutputStream("./test3.txt"));
			
			bos.write('a');
			bos.write('b');
			bos.write('\n');
			bos.write('a');
			bos.write('b');
			
			System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try{ bos.close();} catch(IOException e) {}
		}
		
	}

}
