package utils;

public class ExcelDataProvider {

	public static void main(String[] args) {

		String excelpath = "C:\\Gaurav\\Automation\\Eclipse\\Workspace\\SeleniumJavaFramework\\excel\\data1.xlsx";
		testData(excelpath, "Sheet1");
	}

	public static void testData(String excelpath, String sheetName) {

		ExcelUtilsGeneric excel = new ExcelUtilsGeneric(excelpath, sheetName);

		
		int RowCount = excel.getRowCount();
		int ColCount = excel.getColCount();
		
		
		
		for(int i=1; i<RowCount; i++) {
			for(int j=0; j<ColCount; j++) {

				String celldata = excel.getCellDataString(i, j);
				System.out.print(celldata+" | ");
		
			}
			System.out.println();

		}
	}

}
