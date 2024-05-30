//클래스화
public class Util {
	private String jumin;

	public Util(String jumin) {
		this.jumin = jumin;
	}
	public boolean isCheckJumin(String jumin) {
		String strJumin = this.jumin.replaceAll("-", "");

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
}
