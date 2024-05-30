import java.util.Properties;
import java.util.Set;

public class PropertiesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props = System.getProperties();
		
		Set<String> names = props.stringPropertyNames();
		for (String name : names) {
			//System.out.println(name); //시스템 전체줄력
		}
		
		System.out.println(props.getProperty("java.runtime.version")); 
		System.out.println(props.getProperty("user.language"));  
	}

}
 