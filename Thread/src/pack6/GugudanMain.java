package pack6;

public class GugudanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Gugudan g1 = new Gugudan(2);
		Gugudan g2 = new Gugudan(8);
		
		g1.setDaemon(true);
		g2.setDaemon(true);
		
		g1.setName("2단");
		g2.setName("8단");
		
		
		System.out.println("시작");
		g1.start();
		g2.start();
		
		
		/*try {
			Thread.sleep( 3 * 1000 ); //잠시 멈춤 기능
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage() );
		} */ 
	
		
		System.out.println("끝");
		
	}

}
