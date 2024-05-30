
public class StringEx04 {
	
	// ex03을 메서드화
	public static String capitalizeName(String strName) {
		String[] names = strName.split(" ");
		String result = "";
		for (String name : names) {
			result += name.substring(0, 1).toUpperCase() + name.substring(1) + " ";
		}
		return result.trim();
	}

	public static void main(String[] args) {
		// 입력값검사
		if (args.length != 1) {
			System.out.println("1개를 입력");
		} else {
			String result = StringEx04.capitalizeName(args[0]);
			System.out.println(result);
		}

	}

}
