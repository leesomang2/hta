package Ex;

public class Ex5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"kim", "park", "yi"};
		
		for(int i = 0; i < names.length; i++)
			System.out.println("names["+i+"]:"+names[i]); //배열 인덱스로 출력
		
		String tmp = names[2]; // tmp 에 names에 세번째 요소 tmp에 저장
		System.out.println("tmp:" + tmp); // tmp = yi
		names[0] ="yu"; //첫번째 요소 값 yu로변경
		
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]); //다시출력
	}
   
}
