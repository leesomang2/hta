import java.io.FileWriter;
import java.io.IOException;

public class IOEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			FileWriter fw = null;
			
			try {
				fw = new FileWriter("./test2.txt");
				
				fw.write("Hello");
				fw.write("String");
				fw.write("\n");
				fw.write("Hello");
				fw.write("String");
				fw.write("\n");
				fw.write("안녕 문자열");
				
				System.out.println("출력완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러] " + e.getMessage());
			}finally{
				try {fw.close();} catch(IOException e) {}
			}
		
	}

}
