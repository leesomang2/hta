import java.io.File;

public class FileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//디렉토리 -생성 /이름 변경 / 삭제
		File file = new File("c:/java/dir1"); //디렉토리생성 있을경우 실패
		File file2 = new File("c:/java/dir2");
		
		
		if(file2.delete()) {  //삭제
		//if(file.renameTo(file2)) {  //디렉토리 이름바꾸기
		//if(file.mkdir()) { //생성
			System.out.println("성공"); //없으면 생성후 성공출력
		}else {
			System.out.println("실패"); //있으면 실패 
		}
	}

}
