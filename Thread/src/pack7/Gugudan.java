package pack7;

public class Gugudan extends Thread {
		
	private int dan;
	
	public Gugudan (int dan ) {
		this.dan = dan;
	}
	
	@Override
	public void run() {
		
		System.out.println(this.getName() + "시작"); //스레드의 이름
		
		if( dan == 8) {
			System.out.println(this.getName() +" yield ... ");
			Thread.yield();
		}
		
		for (int i = 1; i <= 9; i ++)
			System.out.printf("%s X %s = %s%n", dan, i, ( dan * i ));
			//System.out.println(dan + " X " + i + " = " + dan * i);
	}
}
