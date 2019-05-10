package java.util;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	static Workbook book;
	static Sheet sheet;
	
	public static String TestDataPath = "C:\\Users\\Sriram N J\\workspace\\SeleniumPractice\\src\\test\\"
			+ "java\\TestData\\TestDataSheet.xlsx";
	

	public static Object[][] getTestData(String sheetName) throws Exception{
	
		FileInputStream file = new FileInputStream(TestDataPath);
		book = WorkbookFactory.create(file);
		sheet = book.getSheet(sheetName);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0; i<sheet.getLastRowNum(); i++){
			for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++){
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
		
	}

}
