package pack8;

public class Account {
		//통장잔고
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	//인출메서드
	public synchronized void withdraw (int money) { //synchronized 사용으로 -가 안뜸
		if(balance >= money) {
			try {
				
				Thread.sleep(1000);
				
				balance -= money; // 통장에서 인출
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("잔고가 없습니다.");
		}
	}
}
