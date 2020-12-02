package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Loginpage extends Testbase
{
	@FindBy(id="email")
	public WebElement EmailAddress;

	@FindBy(name="pass")
	public  WebElement Password;

	@FindBy(xpath="//a[@role='button']")
	WebElement CreateNewAccount;

	@FindBy(xpath="//input[@name='firstname']")
	WebElement Firstname;

	@FindBy(xpath="//input[@name='lastname']")
	WebElement Surname;

	
	public Loginpage()
	{
		super();
		PageFactory.initElements(driver, this);
	}

	public String VerifyTitle()
	{
		String t= driver.getTitle();
		return t;
	}

	public String VerifyUrl()
	{
		String u= driver.getCurrentUrl();
		return u;
	}

	public void VerifyEmail(String user)
	{
		EmailAddress.sendKeys(user);
	}

	public void VerifyPassword(String pass)
	{
		Password.sendKeys(pass);
	}

	public void Verifycreatenewaccount()
	{
		CreateNewAccount.click();
	}

}