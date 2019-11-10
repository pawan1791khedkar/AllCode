package keyword_driven_test;



public class Execution 
{
	public static void main(String args[]) throws Exception
	{
	String path12 = "D:\\ExelData\\Key_Driven.xlsx";
	ExelUtility.setexcel(path12, 0);
	//Action_Keyword object=new Action_Keyword();
	for(int i=1; i<=3; i++)
	{
	String keyword = ExelUtility.getdata(i, 3);
	if(keyword.equals("openbrowser"))
	{
		Action_Keyword.openbrwoser();
	}
	else if(keyword.equals("navigate"))
	{
		Action_Keyword.navigate();
	}
	else if(keyword.equals("click_DF"))
	{
		Action_Keyword.click_df();
	}
	}
	}
	}

