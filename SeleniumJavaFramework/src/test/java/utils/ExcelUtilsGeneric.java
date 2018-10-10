package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import afu.org.checkerframework.checker.formatter.FormatUtil.ExcessiveOrMissingFormatArgumentException;

public class ExcelUtilsGeneric {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	// Calling Constructor (Special method with Name is same as class Name without return type)

	public ExcelUtilsGeneric(String excelpath, String sheetName) {
		try {

			projectpath = System.getProperty("user.dir");

			// Create reference for workbook
			workbook = new XSSFWorkbook(excelpath);

			// Create reference for worksheet

			sheet = workbook.getSheet(sheetName);

		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCellDataString(0,0);
		getCellDataNumeric(1,1);
	}
	// creating function to get row count
	public static int getRowCount() {
		int rowCount=0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return rowCount;
	}


	// creating function to get column count
	public static int getColCount() {
		int ColCount=0;
		try {
			ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of columns : "+ColCount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}


		return ColCount;
	}

	// Getting String Cell Values
	public static String getCellDataString(int rowNum, int ColNum) {
		String cellData=null;
		try {

			// Getting string Cell data
			cellData = sheet.getRow(rowNum).getCell(ColNum).getStringCellValue();
			//System.out.println(cellData);

			// We are hard coding values here for rows and columns

		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return cellData;
		
	}

	// Getting numeric Cell Values
	public static void getCellDataNumeric(int rowNum, int ColNum) {
		try {

			// Getting numeric Cell data
			double cellData = sheet.getRow(rowNum).getCell(ColNum).getNumericCellValue();
			System.out.println("Cell Data is "+cellData);

			// We are hard coding values here for rows and columns

		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}


}
