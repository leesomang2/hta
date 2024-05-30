import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// File객체를 통한 디렉토리 정보가져오기
		
		//디렉토리
		File f11 = new File("c:\\java\\eclipse");
		File f12 = new File("c:/java/eclipse");
		File f13 = new File("c:/java/eclipse1");
		
		
		//exist()   존재확인method
		System.out.println(f11.exists()); //존재파일 true
		System.out.println(f13.exists()); //없는파일 false
		
		
		File f21 = new File("c:/java/eclipse/eclipse.exe");
		File f22 = new File("c:/java/eclipse/eclipse.bat");
		
		System.out.println(f21.exists());
		System.out.println(f22.exists());
		
		// isDirectory () / isFile() 파일인지 디렉토리인지 확인
		System.out.println(f21.isFile());
		System.out.println(f21.isDirectory());
		
		//canExecute / canRead /canWrite  -permisson 
		System.out.println(f21.canWrite());
		
		// isHidden 
		File f23 = new File("c:/java/test.txt");
		System.out.println(f23.isHidden());
		
	}

}
