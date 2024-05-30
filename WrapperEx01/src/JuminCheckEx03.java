//주민번호 입력검사 5월8일 티스토리 메서드화
public class JuminCheckEx03 {

	// 메서드
	public static boolean isCheckJumin(String jumin) {
		String strJumin = jumin.replaceAll("-", "");

		int[] bits = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < bits.length; i++) {
			sum += Integer.parseInt(strJumin.substring(i, i + 1)) * bits[i];
		}
		int lastNum = Integer.parseInt(strJumin.substring(12, 13));
		int resultNum = (11 - (sum % 11)) % 10;
		if (lastNum == resultNum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력
		if (args.length != 1) {
			System.out.println("java JuminCheck xxxxxx-xxxxxxx으로 입력해야함");
		} else {
			// System.out.println("정상 입력");
			if (args[0].length() != 14) {
				System.out.println("14자리를 입력하셔야 합니다.");
			} else {
				// System.out.println("정상 입력");
				String[] jumins = args[0].split("-");
				if (jumins[0].length() != 6 || jumins[1].length() != 7) {
					System.out.println("앞자리나 뒷자리가 틀립니다.");
				} else {
					// System.out.println("정상");
					if (isCheckJumin(args[0])) {
						System.out.println("주민번호 정확");
					} else {
						System.out.println("주민번호 부정확");
					}
				}

			}
		}
	}
}
