import java.util.Properties;
import java.util.Set;

public class PropertiesEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props = new Properties();
		props.setProperty("timeout", "30");
		props.setProperty("language", "ke");
		props.setProperty("size", "10");

		System.out.println(props);
		System.out.println(props.size());

		props.setProperty("language", "us");
		System.out.println(props);

		props.getProperty("timeout");

		Set<String> names = props.stringPropertyNames();
		for (String name : names) {
			System.out.println(name);
		}
	}

}
