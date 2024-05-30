import java.io.IOException;

public class ProcessBuilderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// windows 내부 프로그램 실행
		// 프로그램의 위치를 파악하고 있어야됨
		try {
			ProcessBuilder processBuilder =

			//new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");// 역슬래시2개로바꾸기
			//new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe","www.google.com");// 역슬래시2개로바꾸기
			new ProcessBuilder("C:\\Windows\\System32\\notepad.exe");// 속성->대상  
					processBuilder.start();
		} catch (IOException e) {// Exception처리해줘야함 블록감싸서 우클릭 surround with
			System.out.println(e.getMessage());
		}
	}

}
