package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCellDataString();
		getCellDataNumeric();
	}
	// creating function to get row count
	public static void getRowCount() {

		try {

			projectpath = System.getProperty("user.dir");
			// Create reference for workbook
			workbook = new XSSFWorkbook(projectpath+"/excel/data1.xlsx");

			// Create reference for worksheet
			sheet = workbook.getSheet("sheet1");

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);

		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	// creating function to get column count
	public static void getColCount() {

		try {

			projectpath = System.getProperty("user.dir");
			// Create reference for workbook
			workbook = new XSSFWorkbook(projectpath+"/excel/data1.xlsx");

			// Create reference for worksheet
			sheet = workbook.getSheet("sheet1");

			int ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of columns : "+ColCount);

		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	// Getting Sting Cell Values
	public static void getCellDataString() {
		try {

			projectpath = System.getProperty("user.dir");
			// Create reference for workbook
			workbook = new XSSFWorkbook(projectpath+"/excel/data1.xlsx");

			// Create reference for worksheet
			sheet = workbook.getSheet("sheet1");

			// Getting string Cell data
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Cell Data is "+cellData);

			// We are hard coding values here for rows and columns

		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}

	// Getting numeric Cell Values
	public static void getCellDataNumeric() {
		try {

			projectpath = System.getProperty("user.dir");
			// Create reference for workbook
			workbook = new XSSFWorkbook(projectpath+"/excel/data1.xlsx");

			// Create reference for worksheet
			sheet = workbook.getSheet("sheet1");

			// Getting numeric Cell data
			double cellData = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println("Cell Data is "+cellData);
			
			// We are hard coding values here for rows and columns


		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}


}
