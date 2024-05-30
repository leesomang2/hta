import java.io.File;
import java.util.Date;

public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("c:/java/eclipse-jee-2024-03-R-win32-x86_64.zip");
		
		if(f1.exists()) {
			System.out.println("파일 존재");
			//length        byte/kbyte/mbyte//gbyte
			long fileSize = f1.length();
			System.out.println( fileSize ); //단위 바이트 byte 
			System.out.println( fileSize / 1024 ); // kbyte로 변환
			System.out.println( fileSize / 1024. ); //double형태로 출력
			
			//생성날짜  lastModified ->long인이유는 timestamp형식으로 출력 =>날짜로 바꿔줘야함
			long fileDate = f1.lastModified();
			System.out.println( fileDate );
			System.out.println(new Date(fileDate).toLocaleString()); //날짜로 바꿔주기
			
		}else {
			System.out.println("파일 부존재");
		}
	}

}
