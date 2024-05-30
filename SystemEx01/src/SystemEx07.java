
public class SystemEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//시스템에 대한 환경정보
		System.out.println(System.getProperty("os.name")); //os이름
		System.out.println(System.getProperty("user.name")); //유저이름
		System.out.println(System.getProperty("user.home")); //
		
		System.out.println(System.getenv("JAVA_HOME")); //시스템 정보 접근
		System.out.println(System.getenv("Path")); //
		
		
		
		
	}

}
