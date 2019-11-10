package data_driven_test;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadexcelusingHashmap 
{
	private static XSSFWorkbook wb;
    private static XSSFSheet sheet;
    private static FileInputStream fis;
	private static XSSFRow Row;
	
	static String excelPath = "D:\\ExelData\\CompareData1.xlsx";
	
	
	public static void loadexel() throws Exception 
	{
		
		File fin = new File(excelPath);
	    fis = new FileInputStream(fin);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		fis.close();
		
}
	public static  Map<String,Map<String,String>>getDataMap() throws Exception
	{
		if(sheet==null)
		{
			loadexel();
	}
		 Map<String,Map<String,String>>superMap=new  HashMap<String,Map<String,String>>();
		 Map<String,String> myMap=new HashMap<String,String>();
		 
		 for(int i=1;i<sheet.getLastRowNum()+1;i++)
		 {
			 Row=sheet.getRow(i);
			 String keyCell=Row.getCell(0).getStringCellValue(); 
			 
			 int column=Row.getLastCellNum();
			 for(int j=1;j<column;j++)
			 {
				 String value=Row.getCell(j).getStringCellValue();
				 myMap.put(keyCell, value);
			 }
			 superMap.put("MASTERDATA", myMap);
		 }
		return superMap;
	}
	public static String getvalue(String key) throws Exception
	{
		Map<String,String>myValue=getDataMap().get("MASTERDATA");
		String retvalue=myValue.get(key);
		return retvalue;
	}

	public static void main(String []args) throws Exception
	{
		
		System.out.println(getvalue("baseUrl"));
		System.out.println(getvalue("username"));
		System.out.println(getvalue("password"));
		System.out.println(getvalue("Firstname"));
		System.out.println(getvalue("Lastname"));
		System.out.println(getvalue("Address"));
	}
	
}

