import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = null;
		
		try {
			//파일이 없으면 새로 생성하면서 진행 / 있으면 오버라이팅(지우고다시만듬)
			bw = new BufferedWriter(new FileWriter("./test1.txt"));
			 
			//append mode 추가모드  true
			//bw = new BufferedWriter(new FileWriter("./test1.txt" , true) );
			
			bw.write("안녕 스트링");
			bw.write(System.lineSeparator()); //엔터키
			bw.write("안녕 스트링");
			bw.write(System.lineSeparator());
			
			System.out.println("출력완료");
			//FileNotFoundException 없음
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {bw.close();} catch(IOException e) {}
		}
	}

}
