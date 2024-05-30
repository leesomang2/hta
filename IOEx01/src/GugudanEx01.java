import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class GugudanEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("몇단?");
		String s = sc.nextLine();
		FileOutputStream fos = null;
		
		
		try {
			fos = new FileOutputStream("./"+ s + "단.txt");
			
			for(int i = 1; i <= 9; i++) {
				int j = Integer.parseInt(s);
				fos.write(j+" * " + i + "= " + j * i);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally {
			try {fos.close();} catch(IOException e) {}
		}
		
		
	}

}
