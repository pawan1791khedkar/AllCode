package data_driven_test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwoExcelComparison 
{
	 public static void main(String[] args) {
	        try {
	        	 
	        	// get input excel files
	    FileInputStream excellFile1 = new FileInputStream(new File("D:\\ExelData\\CompareData1.xlsx"));

	   	FileInputStream excellFile2 = new FileInputStream(new File("D:\\ExelData\\CompareData2.xlsx"));


	        	// Create Workbook instance holding reference to .xlsx file
	     XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
	     XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);

	        	// Get first/desired sheet from the workbook
	     XSSFSheet sheet1 = workbook1.getSheet("Sheet1");
	     XSSFSheet sheet2 = workbook2.getSheet("Sheet1");

	        	// Compare sheets
	     if(compareTwoSheets(sheet1, sheet2)) {
	     System.out.println("\n\nThe two excel sheets are Equal");
	     } 
	     else 
	     {
	       System.out.println("\n\nThe two excel sheets are Not Equal");
	        	}

	        	//close files
	        	excellFile1.close();
	        	excellFile2.close();

	        } catch (Exception e) {
	        	e.printStackTrace();
	        }

	 }

	    // Compare Two Sheets
	    public static boolean compareTwoSheets(XSSFSheet sheet1, XSSFSheet sheet2) {
	        int firstRow1 = sheet1.getFirstRowNum();
	        int lastRow1 = sheet1.getLastRowNum();
	        boolean equalSheets = true;
	        for(int i=firstRow1; i <= lastRow1; i++) {
	           
	            System.out.println("\n\nComparing Row "+i);
	           
	            XSSFRow row1 = sheet1.getRow(i);
	            XSSFRow row2 = sheet2.getRow(i);
	            if(compareTwoRows(row1, row2)) {
	                equalSheets = false;
	                System.out.println("Row "+i+" - Not Equal");
	               // break;
	            } else {
	                System.out.println("Row "+i+" - Equal");
	            }
	        }
	        return equalSheets;
	    }

	  // Compare Two Rows
	    public static boolean compareTwoRows(XSSFRow row1, XSSFRow row2) {
	        if((row1 == null) && (row2 == null)) {
	            return true;
	        } else if((row1 == null) || (row2 == null)) {
	            return false;
	        }
	       
	        int firstCell1 = row1.getFirstCellNum();
	        int lastCell1 = row1.getLastCellNum();
	        boolean equalRows = true;
	       
	        // Compare all cells in a row
	        for(int i=firstCell1; i <= lastCell1; i++) {
	            XSSFCell cell1 = row1.getCell(i);
	            XSSFCell cell2 = row2.getCell(i);
	            if(compareTwoCells(cell1, cell2)) {
	                equalRows = false;
	                System.err.println("Cell "+i+" - NOt Equal");
	                break;
	            } else {
	                System.out.println("Cell "+i+" - Equal");
	            }
	            
	        }
	        return equalRows;
	    }

	    // Compare Two Cells
	    public static boolean compareTwoCells(XSSFCell cell1, XSSFCell cell2) {
	        if((cell1 == null) && (cell2 == null)) {
	            return true;
	      
	        }
			return false;
			
	       
	    }
}