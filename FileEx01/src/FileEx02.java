import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//경로정보
		
		File f1 = new File("c:/java/eclipse/eclipse.exe"); //절대경로
		File f2 = new File("../../eclipse.exe"); //상대경로
		
		System.out.println( f1.getName());
		System.out.println( f2.getName());
		
		System.out.println(f1.getParent());
		System.out.println(f2.getParent()); // 상대경로인 ..이 표시됨
		
		System.out.println(f1.getPath()); //경로 그대로표시
		System.out.println(f2.getPath());
		
		try {
			System.out.println(f1.getCanonicalPath());
			//
			System.out.println(f2.getCanonicalPath()); //상대경로인파일 절대경로로 환산
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
