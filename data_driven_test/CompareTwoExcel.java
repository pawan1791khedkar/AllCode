package data_driven_test;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareTwoExcel 
{
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	public static String[][] getTableArray(String FilePath, String SheetName) throws Exception {   

		String[][] tabArray = null;

		try {
			File src=new File("D:\\GOOGLEFROM.xlsx");
			FileInputStream ExcelFile = new FileInputStream("src");

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			int startRow = 1;

			int startCol = 1;

			int ci,cj;

			int totalRows = ExcelWSheet.getLastRowNum();

			// you can write a function as well to get Column count

			int totalCols = 1;

			tabArray=new String[totalRows][totalCols];

			ci=0;

			for (int i=startRow;i<=totalRows;i++, ci++) {           	   

				cj=0;

				for (int j=startCol;j<=totalCols;j++, cj++){

					tabArray[ci][cj]=getCellData(i,j);

					System.out.println(tabArray[ci][cj]);  

				}

			}

		}

		catch (FileNotFoundException e){

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return(tabArray);

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception 
	{

		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		
		String CellData = Cell.getStringCellValue();
		return CellData;

	}
}//end class
