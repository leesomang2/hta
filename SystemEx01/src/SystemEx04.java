
public class SystemEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시간측정

		// timestamp - 밀리세컨드
		System.out.println(System.nanoTime()); //
		System.out.println(System.currentTimeMillis());

		long time1 = System.nanoTime();

		int sum = 0;
		for(int i =1; i <= 1_000_000; i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();
		System.out.println("실행 시간 : "+(time2-time1));
	}

}
