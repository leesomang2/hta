import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class ExcelEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Workbook workBook = null;
		
		try {
			workBook = Workbook.getWorkbook(new FileInputStream("./jxlrwtest.xls"));
			
			Sheet sheet = workBook.getSheet(0);
			
			System.out.println( sheet.getName());
			System.out.println( sheet.getRows());//데이터의 갯수
			System.out.println( sheet.getColumns());
			
			//데이터(열 => cell) 접근
			//Cell cell = sheet.getCell(0,0);
			//System.out.println(cell.getContents());
			
			//for문으로 가져오기
			for(int i = 0; i < 11; i++) {
				Cell cell = sheet.getCell(i,2);
				System.out.println(cell.getContents());
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
