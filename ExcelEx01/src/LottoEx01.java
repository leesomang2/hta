import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.*;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workbook workBook = null;
		
		try {
			workBook = Workbook.getWorkbook(new FileInputStream("./lotto(1119).xls"));
			
			Sheet sheet = workBook.getSheet(0);
			for(int row = 4 ;  row <= sheet.getRows(); row++) {
				Cell turn = sheet.getCell(2-1,row-1);
				Cell num1 = sheet.getCell(14-1,row-1);
				Cell num2 = sheet.getCell(15-1,row-1);
				Cell num3 = sheet.getCell(16-1,row-1);
				Cell num4 = sheet.getCell(17-1,row-1);
				Cell num5 = sheet.getCell(18-1,row-1);
				Cell num6 = sheet.getCell(19-1,row-1);
				System.out.printf("%2s회 %2s %2s %2s %2s %2s %2s \n" ,
						turn.getContents(),
						num1.getContents(),num2.getContents(),num3.getContents(),
						num4.getContents(),num5.getContents(),num6.getContents());
			}
					
					
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]" + e.getMessage());
		}finally{
			if(workBook != null) workBook.close();
		}
	}

}
