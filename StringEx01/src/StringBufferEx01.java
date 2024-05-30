
public class StringBufferEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer();
		
		StringBuffer sb2 = new StringBuffer(100);//내부 버퍼의 크기
		StringBuffer sb3 = new StringBuffer("Hello StringBuffer");//
		
		//buffer의크기 기본사이즈 16  sb3은 적은문자+16
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		//length 랑 크기는 별개
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		
		//chatAt 한문자추출
		//substring 여러개추출
		//indexOf/lastIndexOf 검색 
		//replace 치환
		
		//문자열조작
		//append / insert / delete
		
		System.out.println(sb3);
		sb3.append("안녕");
		System.out.println(sb3);
		sb3.insert(3, " 추가 "); //3번째 추가 글자 추가
		System.out.println(sb3);
		sb3.delete(0,4);
		System.out.println(sb3);
		
	}

}
