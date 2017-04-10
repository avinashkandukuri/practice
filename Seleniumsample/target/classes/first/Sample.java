package first;

import java.io.File;

import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.ss.util.WorkbookUtil;

import com.google.common.collect.Table.Cell;

public class Sample {

	public void main (String[] args){
		File f = new File("C:/Users/avinash/Desktop/testdata.xls");
		Workbook W = Workbook.getWorkbook(f);
		SheetUtil s = W.getsheet(0);
		int rows = s.getrows();
		int coloumns = s.getcoloumns();
		String inputData[][] = new String[rows][coloumns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumns; j++) {
				Cell c = s.getCell(j, i);
				inputData[i][j] = C.getcontents();
				System.out.println(inputData[i][j]);
			}
	}
}
