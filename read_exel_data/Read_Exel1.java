package read_exel_data;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Exel1 
{
	public static void main(String[] args) throws Exception
	{
		File src=new File("D:\\ExelData\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=Wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total row is"+rowcount);
		for(int i=0;i<rowcount;i++)
		{
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from row1 is"+data0);
		}
		Wb.close();
}
}