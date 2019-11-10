package com.Product.ReUsable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Product.PO.PO_LOGIN;

public class MainLogin
{
	WebDriver driver;
	public MainLogin()
	{
	PO_LOGIN Login_Main1 =PageFactory.initElements(driver, PO_LOGIN.class);
	Login_Main1.My_Account();
	Login_Main1.Sign_in();
	Login_Main1.Username();
	Login_Main1.Password();
	Login_Main1.Sign_In_Log();
	

}
}