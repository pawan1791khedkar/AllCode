package data_driven_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwoExcelSheetCompareUsingArrayList 
{
    public static void main(String args[]) 
    {
        try {

            ArrayList arr1 = new ArrayList();
            ArrayList arr2 = new ArrayList();
         
            FileInputStream file1 = new FileInputStream(new File("D:\\ExelData\\CompareData1.xlsx"));
            FileInputStream file2 = new FileInputStream(new File("D:\\ExelData\\CompareData2.xlsx"));
                   
            // Get the workbook instance for XLS file
            XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
            XSSFWorkbook workbook2 = new XSSFWorkbook(file2);

            // Get first sheet from the workbook
            XSSFSheet sheet1 = workbook1.getSheet("Sheet1");
            XSSFSheet sheet2 = workbook2.getSheet("Sheet1");

            // Compare sheets

            // Get iterator to all the rows in current sheet1 and sheet2
            Iterator<Row> rowIterator1 = sheet1.iterator();
            Iterator<Row> rowIterator2 = sheet2.iterator();
            //iterate all row in sheet1
            while (rowIterator1.hasNext()) 
            {
                Row row = rowIterator1.next();
                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
               
                //iterate all column in sheet1
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    // This is for read only one column from excel
                    if (cell.getColumnIndex() <= 1) {
                        // Check the cell type and format accordingly
                           switch (cell.getCellType()) {
                       
                        case Cell.CELL_TYPE_STRING:
                            arr1.add(cell.getStringCellValue());
                            System.out.print(cell.getStringCellValue());
                            break;
                        }

                    }

        }
              
            }
          
            file1.close();

            
            //  //iterate all row in sheet2
            while (rowIterator2.hasNext())
            {
                Row row1 = rowIterator2.next();
                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator1 = row1.cellIterator();
                //iterate all column in sheet2
                while (cellIterator1.hasNext()) 
                {
                    Cell cell1 = cellIterator1.next();
                    // Check the cell type and format accordingly

                    // This is for read only one column from excel
                    if (cell1.getColumnIndex() <= 1)
                    {
                        switch (cell1.getCellType()) 
                        {
                        case Cell.CELL_TYPE_STRING:
                            arr2.add(cell1.getStringCellValue());
                            System.out.print(cell1.getStringCellValue());
                            break;
                     
                        }

                    }
                    
                }

                System.out.println("");
            }
            System.out.println("ArrayList1" + arr1);
            System.out.println("ArrayList2 " + arr2);   
          
      // compare two arrays
                
    if(arr1.equals(arr2))
    
		{
			System.out.println("the data are same from both excel files");
		} 
		else 
		{
			System.out.println("the data are different from both excel files");
		}
            // closing the files
            file1.close();
            file2.close();
            
            }
        
           catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
        


