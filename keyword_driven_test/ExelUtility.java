package keyword_driven_test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtility
{
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static void setexcel(String path, int sheetnum) throws Exception
	{
	try
	{
		File src = new File(path);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis); 
		sheet = wb.getSheetAt(0);
		
		}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
	public static String getdata(int rownum, int cellnum)
	{
		String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue(); 
		return data;
	}
}


