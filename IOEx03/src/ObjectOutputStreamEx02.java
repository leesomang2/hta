import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p = new Person("홍길동", "010-111-1111", 20, "서울시");
//		String str = new String("홍길동");
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./serial.ser"));
			
			oos.writeObject( p );
//				oos.writeObject( str );
			
			
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+ e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+ e.getMessage());
			e.printStackTrace();
		}finally {
			try {oos.close();}catch(IOException e) {}
		}
	}

}
