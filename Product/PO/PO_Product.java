package com.Product.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_Product 
{
	WebDriver driver;
	public PO_Product(WebDriver driver)
	{
		this.driver=driver;
}
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In1;
	@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
	WebElement Electronic;
	@FindBy(how=How.XPATH,using="//*[@id='slider_31_1']/span[1]")
	WebElement SliderA;
	@FindBy(how=How.XPATH,using="//*[@id='slider_31_1']/span[2]")
	WebElement SliderB;
	@FindBy(how=How.LINK_TEXT,using="Profile details")
	WebElement ProfileDetail;
	@FindBy(how=How.ID,using="email")
	WebElement Email;
	@FindBy(how=How.ID,using="password1")
	WebElement Password1;
	@FindBy(how=How.ID,using="password2")
	WebElement ConfirmPassword;
	@FindBy(how=How.ID,using="birthday")
	WebElement birthday;
	@FindBy(how=How.ID,using="elm_14")
	WebElement FirstName;
	@FindBy(how=How.ID,using="elm_16")
	WebElement LastName;
	@FindBy(how=How.ID,using="elm_30")
	WebElement Phone;
	@FindBy(how=How.ID,using="elm_18")
	WebElement Address;
	@FindBy(how=How.ID,using="elm_22")
	WebElement City;
	@FindBy(how=How.ID,using="elm_26")
	WebElement Country;
	@FindBy(how=How.ID,using="elm_24")
	WebElement State;
	@FindBy(how=How.ID,using="elm_28")
	WebElement ZipCode;
	@FindBy(how=How.ID,using="sw_sa_suffix_yes")
	WebElement Validate;
	@FindBy(how=How.ID,using="save_profile_but")
	WebElement Save;
	
	public void My_Account() 
	{
		My_Account.click();
		}
	public void Sign_in()
	{
		Sign_in.click();
		}
	public void Username()
	{
		Username.clear();
		Username.sendKeys("customer@example.com");
	}

	public void Password()
	{
		Password.clear();
		Password.sendKeys("customer");
	}
	public void Sign_In1()
	{
		Sign_In1.click();
	
	}
	public void MoveElement()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Electronic).perform();
	
	}
	public void Electronic()
	{
		Electronic.click();

	}
	public void SliderA()
	{
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(SliderA, 50, 0).build().perform();
		 SliderA.click();
		
	}
	
	public void SliderB() 
	{
		Actions action = new Actions(driver);
		action.dragAndDropBy(SliderB,-50, 0).release().perform();
		 SliderB.click();
	}
	public void slider()
	{
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		SliderB=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='slider_31_1']/span[2]")));
		SliderB.click();
	}
	public void ProfileDetail()
	{
		ProfileDetail.click();
}
	public void Email()
	{
		Email.clear();
		Email.sendKeys("customer@example.com");
}
	public void Password1()
	{
		Password1.clear();
		Password1.sendKeys("");
}
	public void ConfirmPassword()
	{
		ConfirmPassword.clear();
		ConfirmPassword.sendKeys("");
}
	public void birthday()
	{
		birthday.sendKeys("10");
	}
	public void FirstName()
	{
		FirstName.clear();
		FirstName.sendKeys("Customer");
	}
	public void LastName()
	{
		LastName.clear();
		LastName.sendKeys("Customer");
	}
	public void Phone()
	{
		Phone.sendKeys("");
	}
	public void Address()
	{
		Address.clear();
		Address.sendKeys("44 Main street");
	}
	public void City()
	{
		City.clear();
		City.sendKeys("Boston");
	}//explicit wait
	public void city()
	{
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		City=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elm_22")));
		City.click();
	}
	public void Country()
	{
		Select select=new Select(Country);
		select.selectByVisibleText("United States");
	}
	public void State()
	{
		Select select=new Select(State);
		select.selectByVisibleText("Massachusetts");
}
	public void ZipCode()
	{
		State.sendKeys("02134");
}
	public void Validate()
	{
		Validate.isSelected();
}
	public void Save()
	{
		Save.click();
}
}