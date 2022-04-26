package externalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFiles {

	public static void main(String[] args) throws IOException {

		String path = "myData\\myExcel02212022_031459.xlsx";
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheetAt(0);

//		Row r0 = ws.getRow(0);
//		Cell c0 = r0.getCell(3);

//		System.out.println(c0);

		// print the number of rows in excel...
		System.out.println(ws.getPhysicalNumberOfRows());

		// print first row 4th column...
		System.out.println(ws.getRow(0).getCell(3));

		// print all rows in excel...
		for (int i = 0; i < ws.getPhysicalNumberOfRows(); i++) {
			System.out.println(ws.getRow(i).getCell(3));
		}

		fi.close();
	}

}
