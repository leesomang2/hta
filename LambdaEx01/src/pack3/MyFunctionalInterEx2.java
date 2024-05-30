package pack3;

public class MyFunctionalInterEx2 {
	
	//처리의 흐름
	public static int sum (int x, int y) {
		return x + y;
	}
	public static int product (int x, int y) {
		return x * y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInter2 f = (x,y) ->sum(x,y);
		System.out.println(f.method(10, 20));
		
		f = (x,y) -> product (x, y);
		System.out.println(f.method(10, 20));
	}

}
