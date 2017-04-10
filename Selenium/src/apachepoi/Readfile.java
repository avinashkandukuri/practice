package apachepoi;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfile {

	public static void main(String[] args) throws Exception  {
		
		
		File src = new File("E:\\data.xlsx");
		FileInputStream fls = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fls);
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		String data1 = Sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Value of the string"+ data1);
		
	}

}
