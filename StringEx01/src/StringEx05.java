
public class StringEx05 {
	//ex03을 Util을 통한 객체화
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("1개를 입력");
		}else {
			Util u = new Util(args[0]);
			System.out.println(u.capitalizeName());
		}
	}

}
