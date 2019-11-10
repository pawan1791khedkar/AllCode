package read_exel_data;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Exel
{
	public static void main(String[] args) throws Exception
	{
		File src=new File("D:\\ExelData\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=Wb.getSheetAt(0);
		String Data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from exel is"+Data0);
		String Data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from exel is"+Data1);
		Wb.close();
		
	}

	
}
