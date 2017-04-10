package practice1;

import java.io.File;

import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

import com.google.common.collect.Table.Cell;

public class Sample1 {

	public static void main(String[] args) {

		File f = new File("C:/Users/avinash/Desktop/testdata.xls");
		Workbook W = WorkbookUtil.getWorkbook(f);
		Sheet s = W.getSheet(0);
		int rows = s.getrows();
		int coloumns = s.getcoloumns();
		String inputData[][] = new String[rows][coloumns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumns; j++) 
			{
				Comment c = s.getCellComment(j, i);
				inputData[i][j] = c.getcontents();
				System.out.println(inputData[i][j]);
			}
		}
	}
}
