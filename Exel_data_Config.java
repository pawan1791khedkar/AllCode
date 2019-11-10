package Lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exel_data_Config 
{
	XSSFWorkbook Wb;
	XSSFSheet sheet1;
	public Exel_data_Config(String ExelPath) 
	{
		try {
			File src=new File("D:\\ExelData\\TestData.xlsx");
			FileInputStream fis=new FileInputStream(src);
			Wb=new XSSFWorkbook(fis);
			
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			
	}
}
	
public String getData(int sheetNumber,int row,int column)
{
	sheet1=Wb.getSheetAt(sheetNumber);
	String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	return data;
	}
}
