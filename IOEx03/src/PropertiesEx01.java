import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Properties
		// HashMap 컬렉션
		
		Properties props = new Properties()	;
		
		props.setProperty("id", "andy");
		props.setProperty("password", "1234");
		props.setProperty("grade", "d");
		
		System.out.println(props);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("./config.properties");
			
			props.store(fw, "System Config");
			
			System.out.println("저장 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {fw.close();}catch(IOException e) {}
		}
		
		
	}

}
