package utils;

public class ExcelUtilsDemo {

	
	public static void main(String[] args) {
	String projetpath=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(projetpath+"\\excel\\data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}
}
