package pack6;

public class Ex13_7 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7());
		t.setDaemon(true);
		t.start();
		for(int i = 1; i <= 10; i++) {
		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			// TODO Auto-generated catch block
			System.out.println(i);
			
			if (i == 5 ) autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		try {
			while(true) {
				Thread.sleep(3 * 1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			if(autoSave) autoSave();
		}
	}
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
		
	}

}
