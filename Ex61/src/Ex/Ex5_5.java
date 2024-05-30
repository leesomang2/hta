package Ex;

public class Ex5_5 {//배열활용 로또번호만들기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45]; //45개의 정수값을 저장하기위한 배열생성
		
		//배열의 각 요소에 1~45의 값을 저장한다.
		for(int i=0; i <ball.length; i++)
			ball[i] = i + 1; //ball[0]에 1 저장후 ball[i]값에 대입
		
		int tmp = 0; // 두 값을 바꾸는데 사용할 변수
		int j = 0; //임의의 값을 얻어서 저장할 변수
		
		//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		//0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i = 0; i < 6; i++) {
		j = (int)(Math.random()*45);//0~44범위의 임의의 값을 얻는다.
		tmp = ball[i]; //i의 값을 tmp에 저장
		ball[i] = ball[j]; //
		ball[j] = tmp;
		}
		
		for(int i = 0 ; i < 6; i++) 
			System.out.printf("ball[%d]=%d%n" , i , ball[i]);
		
		}
	}


