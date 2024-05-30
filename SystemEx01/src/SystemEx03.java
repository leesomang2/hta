
public class SystemEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			System.out.println("java JuminCheck xxxxxx-xxxxxxx으로 입력해야함");
			System.exit(0);
		}
		if(args[0].length() != 14) {
			System.out.println("14자리를 입력하셔야 합니다");
			System.exit(0);
		}
		String[] jumins = args[0].split("-");
		if(jumins[0].length() != 6 || jumins[1].length() != 7) {
			System.out.println("앞자리나 뒷자리 길이가 틀립니다.");
			System.exit(0);
		}
	  System.out.println("정상 입력");
	}

}
