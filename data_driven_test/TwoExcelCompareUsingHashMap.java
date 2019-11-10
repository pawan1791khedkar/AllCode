package data_driven_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwoExcelCompareUsingHashMap
{
	static List sheetData;
	static List data;
	
	public static List loadExcelLines(String fileName,String sheetName)
	{
		String sheetName1 = "Sheet";
	
		// Create an ArrayList to store the data read from excel sheet.
		sheetData = new LinkedList();
		data = new LinkedList();
		FileInputStream excelFile = null;
		try
		{
			excelFile = new FileInputStream(fileName);
			// Create an excel workbook from the file system
			XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
			// Get the sheet on the workbook one by one
			for (int i = 0; i < workBook.getNumberOfSheets(); i++)
			{
					XSSFSheet sheet = workBook.getSheetAt(i);
					sheetName = workBook.getSheetName(i);
					Iterator rows = sheet.rowIterator();
					while (rows.hasNext())

					{
						XSSFRow row = (XSSFRow) rows.next();
						Iterator cells = row.cellIterator();
						while (cells.hasNext())
						{
							XSSFCell cell = (XSSFCell) cells.next();
							sheetData.add(cell);
						}

						sheetData.add(data);
						
					}
				}

			
	}	
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return sheetData;
		}
		public static void main(String args[]) throws FileNotFoundException 
		{
			List list1 =  loadExcelLines("D:\\ExelData\\CompareData1.xlsx","Sheet1");
			List list2 =  loadExcelLines("D:\\ExelData\\CompareData2.xlsx", "Sheet2");
			
			//Display whole List
			System.out.println("Read Sheet1\n"+list1);
			System.out.println( "Read Sheet2\n"+list2);

			System.out.println("\n");
			if(list1.equals(list2))
			{
				System.out.println("the data are same from both excel files");
			} 
			else 
			{
				System.out.println("the data are different from both excel files");
			}
		}
}
