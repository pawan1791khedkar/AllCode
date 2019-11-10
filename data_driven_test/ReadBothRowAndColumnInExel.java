package data_driven_test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadBothRowAndColumnInExel 
{
	public static void main(String[] args) throws Exception
	{
		File src=new File("D:\\GOOGLEFROM.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=Wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		int columncount=sheet1.getRow(0).getLastCellNum();
		
		System.out.println("Total row is"+rowcount);
		System.out.println("Total column is"+columncount);
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
			String data0=sheet1.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data0);
		}
		Wb.close();
}
	
	}
}
