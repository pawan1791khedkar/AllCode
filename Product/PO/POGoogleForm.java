package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.Core.UI_Manager;

public class POGoogleForm 
{
	WebDriver driver;
	UI_Manager GoogleFormPO_UI_Manager = new UI_Manager();
	public POGoogleForm(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//input[@class='whsOnd zHQkBf' and @type='email']")
	private WebElement Username;
	@FindBy(how=How.XPATH,using="//div[@class='qhFLie']")
	private WebElement ClickOnNext;
	@FindBy(how=How.XPATH,using="//input[@name='password' and @type='password']")
	private WebElement Password;
	@FindBy(how=How.XPATH,using="//div[@id='identifierNext']")
	private WebElement ClickOnNext1;
	@FindBy(how=How.XPATH,using="//div[@id=':1d']")
	private WebElement BlankPage;
	@FindBy(how=How.XPATH,using="//textarea[text()='Untitled form']")
	private WebElement Title;
	@FindBy(how=How.XPATH,using="//div[@class='quantumWizTextinputPapertextareaEl modeLight wrapping-text-input freebirdThemedInput freebirdCustomFont hasValue']")
	private WebElement Question;
	@FindBy(how=How.XPATH,using="//div[@class='docssharedWizOmnilistMorselValue']")
	private WebElement Option1;	
	@FindBy(how=How.XPATH,using="//div[text()='Add option']")
	private WebElement AddOption2;	
	@FindBy(how=How.XPATH,using="//div[@class='docssharedWizOmnilistMorselValue']")
	private WebElement Option2;	
	@FindBy(how=How.XPATH,using="//div[text()='Add option']")
	private WebElement AddOption3;
	@FindBy(how=How.XPATH,using="//div[@class='docssharedWizOmnilistMorselValue']")
	private WebElement Option3;	
	@FindBy(how=How.XPATH,using="//div[text()='Add option']")
	private WebElement AddOption4;
	@FindBy(how=How.XPATH,using="//div[@class='docssharedWizOmnilistMorselValue']")
	private WebElement Option4;	
	
	public void Set_UserName(String username) 
	{
		GoogleFormPO_UI_Manager.SetElementText( Username, username);
		}
	public void  ClickOnNext() 
	{
		GoogleFormPO_UI_Manager.ClickElement(ClickOnNext);
		}
	public void Set_Password(String password)
	{
		GoogleFormPO_UI_Manager.SetElementText(Password, password);
		}
	public void  ClickOnNext1() 
	{
		GoogleFormPO_UI_Manager.ClickElement( ClickOnNext1);
		}
	public void ClickOnBlankPage()
	{
		GoogleFormPO_UI_Manager.ClickElement(BlankPage);
		
	}
	public void GiveTitle(String title)
	{
		GoogleFormPO_UI_Manager.SetElementText(Title,title);
		
	}
	public void TypeQuestion(String question)
	{
		GoogleFormPO_UI_Manager.SetElementText(Question, question);
		
	}
	public void SelectOption1(String option1)
	{
		GoogleFormPO_UI_Manager.SetElementText(Option1, option1);
		
	}
	public void AddOption2()
	{
		GoogleFormPO_UI_Manager.ClickElement(AddOption2);
		
	}
	public void SelectOption2(String option2)
	{
		GoogleFormPO_UI_Manager.SetElementText(Option2,option2);
		
	}
	public void AddOption3()
	{
		GoogleFormPO_UI_Manager.ClickElement(AddOption3);
		
	}
	public void SelectOption3(String option3)
	{
		GoogleFormPO_UI_Manager.SetElementText(Option3,option3);
		
	}
	public void AddOption4()
	{
		GoogleFormPO_UI_Manager.ClickElement(AddOption4);
		
	}
	public void SelectOption4(String option4)
	{
		GoogleFormPO_UI_Manager.SetElementText(Option4,option4);
		
	}
}
