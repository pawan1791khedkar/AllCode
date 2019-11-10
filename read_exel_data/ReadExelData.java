package read_exel_data;

import Lib.Exel_data_Config;

public class ReadExelData 
{
	public static void main(String[] args)
	{
	
		Exel_data_Config exel=new Exel_data_Config("D:\\ExelData\\TestData.xlsx");
		System.out.println(exel.getData(0, 1, 1));
}
}
