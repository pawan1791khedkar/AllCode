package Hybriddriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getdatafromexel 
{
static XSSFWorkbook wb;
static XSSFSheet sheet;
static File src;
static FileInputStream fis;
String data;
public static String inputdata(int sheetnum,int rownum,int cellnum)

	{
	try
	{
		src=new File("D:\\ExelData\\Hybrid1.xlsx");
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetnum);
	} catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
	String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
	return data; 
}
public static String keyword(int sheetno, int rowno, int cellno) throws IOException
{
src = new File("D:\\ExelData\\Hybriddriven.xlsx");
fis = new FileInputStream(src);
wb = new XSSFWorkbook(fis);
sheet = wb.getSheetAt(sheetno);
String data2 = sheet.getRow(rowno).getCell(cellno).getStringCellValue();
return data2;
}
} 

