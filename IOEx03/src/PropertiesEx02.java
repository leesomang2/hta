import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		
		try {
			fr = new FileReader("./config.properties");
			
			Properties props = new Properties();
			props.load(fr);
			
			//System.out.println(props);
			Set<String> keys =props.stringPropertyNames();
			for (String key : keys) {
				System.out.println(key + ":" + props.getProperty(key));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {fr.close();} catch(IOException e) {}
		}
	}

}
