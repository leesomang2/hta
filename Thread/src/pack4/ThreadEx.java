package pack4;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//익명 내부 클래스 ->
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 1 ;  i <=10; i++) {
					System.out.println("go : " + i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 1 ;  i <=10; i++) {
					System.out.println("come : " + i);
				}
			}
		});
		
		// 람다식으로 바꾸기
		Thread t3 = new Thread(() -> {
			for(int i = 1 ;  i <=10; i++) {
				System.out.println("3 : " + i);
			}
		});
		
		System.out.println("시작");
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("끝");
	}

}
