package pack2;

public class Come extends Thread {
	
	@Override
	public void run(){
		// TODO Auto-generated method stub
		//스레드가 처리해야 할 작업 기술
		for(int i = 1 ;  i <=10; i++) {
			System.out.println("come : " + i);
		}
}
}
