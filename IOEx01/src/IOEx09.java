import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("./test2.txt"));
			
			bw.write("Hello string");
			bw.write("\n");
			bw.write("Hello string");
			bw.write(System.lineSeparator()); //엔터키  \n 이랑 같음
			bw.write("Hello string");
			bw.newLine(); //엔터키  \n 이랑 같음
			bw.write("Hello string");
			
			System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
			
		}finally {
			try {bw.close();} catch(IOException e) {}
		}
	}

}
