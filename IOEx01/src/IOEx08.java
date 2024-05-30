import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./test.txt"));
			
			//int data = 0 ;
			//while(( data = br.read()) != -1 ) {
				//System.out.print((char) data); //print 써야되고
			//}
			
			String data = null;
			while(( data = br.readLine()) != null) { //readLine() 한줄씩 읽기가능 
				System.out.println(data); //한줄씩 쓰면 엔터키를 버리기때문에 println으로 출력
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {br.close();} catch(IOException e) {}
		}
	}

}
