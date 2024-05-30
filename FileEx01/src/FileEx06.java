import java.io.File;
import java.io.IOException;

public class FileEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일
		// 새로만들기(File) / 내용변경(다른방식)
		//이름변경 삭제
		File file = new File ("c:/java/test1.txt");
		
			if(file.delete()) {//파일삭제
			//if(file.renameTo(file)) { //파일명변경
			//if(file.createNewFile()) { //파일새로만들기 Exception처리
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		
		}
	}


