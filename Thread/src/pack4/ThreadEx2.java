package pack4;

public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드 람다식
		 // 람다식 사용 ->
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 10; i++) {
                System.out.println("go : " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 10; i++) {
                System.out.println("come : " + i);
            }
        });

        System.out.println("시작");

        t1.start();
        t2.start();

        System.out.println("끝");
    }
		
	

}
