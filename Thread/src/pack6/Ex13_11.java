package pack6;

public class Ex13_11 {
	static long startTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {}	
		
		System.out.println("소요시간 :" + (System.currentTimeMillis()- Ex13_11.startTime));
	}

}

class ThreadEx11_1 extends Thread{
	 public void run() {
		for(int i = 0; i <300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx11_2 extends Thread{
	 public void run() {
		for(int i = 0; i <300; i++) {
			System.out.print(new String("|"));
		}
	}
}