import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringTokenize / split 
		String strData = "사과&참외&&수박&&&딸기";
		
		StringTokenizer st = new StringTokenizer(strData,"&");
		
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		String[] arrDatas = strData.split("&"); 
		System.out.println(arrDatas.length);
		for(String data : arrDatas ) {
			System.out.println(data); //split 처리시 공백그대로
		}
	}

}
