import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//디렉토리 내부 목록 확인 (자식 디렉토리 파일)
		//list () => 문자열목록 
		//listFiles() => 파일 객체 목록
		
		File file1 = new File("c:/java");
		String[] lists = file1.list(); //배열로받음
		System.out.println( Arrays.toString( lists ));
		
		//for문을 통해 가져오기
		
		for (int i = 0; i < lists.length; i++) {
			System.out.println(lists[i]);
			}
		
		//향상 for문
		File[] listFiles = file1.listFiles();
		for(File listFile : listFiles) {
			System.out.println(listFile.getName());
		}
	}

}
