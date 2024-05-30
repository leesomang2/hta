
public class SystemEx05 {
	// String / StringBuffer / StringBuider
	//실행시간 계산
	public static void checkSpeed1() {
		long start = System.currentTimeMillis();
		
		String x = "";
		for(int i=0; i<10_000 ; i++) {
			x += "aaaaa,aaaaa,aaaaa,aaaaa";
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end - start));
	}

	public static void checkSpeed2() {
		long start = System.currentTimeMillis();

		StringBuilder x =new StringBuilder();
		for (int i = 0; i < 10_000; i++) {
			x.append ("aaaaa,aaaaa,aaaaa,aaaaa");
		}

		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end - start));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkSpeed1();
		checkSpeed2();
	}

}
