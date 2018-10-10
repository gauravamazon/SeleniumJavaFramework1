package utils;

public class ExcelUtilsGenericDemo {
	
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		ExcelUtilsGeneric excel = new ExcelUtilsGeneric(projectpath+"/excel/data1.xlsx", "sheet1");
		
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumeric(1, 1);
	}

}
