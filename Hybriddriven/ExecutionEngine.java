package Hybriddriven;

import org.testng.annotations.Test;

public class ExecutionEngine 
{
	
	@Test
	public void i() throws Exception
	{
	//Keyword object = new Keyword();
	for(int i = 0; i<5 ;i++)
	{
	String data = Getdatafromexel.keyword(0, i, 0);
	if(data.equals("openbrowser"))
	{
	Keyword.openbrowser();
	}
	if(data.equals("gotolink"))
	{
		Keyword.gotolink();
	}
	if(data.equals("enterdata"))
	{
		Keyword.enterdata(1);
	}
	if(data.equals("hitenter"))
	{
		Keyword.hitenter();
	}
	if(data.equals("goback"))
	{
		Keyword.goback();
	}
	}
	}
	}

