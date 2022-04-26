package externalFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFiles {

	public static void main(String[] args) throws IOException {

		// Create a excel file with some data
		// WB, Sheet, Row, Cell
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet workSheet1 = workBook.createSheet("Test");
		XSSFSheet workSheet2 = workBook.createSheet("Data");
		
//		Row row0 = workSheet2.createRow(0);
//		Row row1 = workSheet2.createRow(1);
//		Row row2 = workSheet2.createRow(2);
//		Cell cell0 =  row0.createCell(0);		
//		Cell cell1 = row0.createCell(1);
//		Cell cell3 = row1.createCell(0);
//		Cell cell4 = row2.createCell(0);
		
//		cell0.setCellValue("Thor Ragnarok");
//		cell1.setCellValue("Tony Stark");
//		cell3.setCellValue("Captain America");
//		cell4.setCellValue("Hulk");
		
    	workSheet2.createRow(0).createCell(0).setCellValue("Thor Ragnarok");
		workSheet2.createRow(0).createCell(1).setCellValue("Tony Stark");
		workSheet2.createRow(1).createCell(0).setCellValue("Captain America");
		workSheet2.createRow(2).createCell(0).setCellValue("Hulk");
		
//		RandomNumber randomNumber = new RandomNumber();
		
		for(int i=0; i<50; i++) {
			workSheet1.createRow(i).createCell(3).setCellValue(getRandomNumber());
			
		}
		
		//Using date function to create new excel file everytime we run the code
//		DateTimeStampExamples dateTime = new DateTimeStampExamples();
//		String timeStamp = dateTime.getTodayDateTime();
		
		//Path to save excel
		//String path = "myData\\myExcel.xlsx";
//		String path = "myData\\myExcel" + timeStamp +".xlsx";
		String path = "myData\\myExcel"+".xlsx";
		File file = new File(path);
		FileOutputStream fileOutPutStream = new FileOutputStream(file);
		
		//Write to work book
		workBook.write(fileOutPutStream);
		fileOutPutStream.close();
		
	}
	
	public static int getRandomNumber() {
		Random random = new Random();
		int number = random.nextInt(9 - 0 + 1) + 0;
		return number;
	}

}
