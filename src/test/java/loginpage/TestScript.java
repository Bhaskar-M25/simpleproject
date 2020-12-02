package loginpage;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Loginpage;

public class TestScript extends Testbase
{
	Loginpage log;

	@BeforeTest(alwaysRun=true)
	public void Setup()
	{
		Open();
		log =new Loginpage();
	}

	@Test
	public void ValidateTitle()
	{
		String str=log.VerifyTitle();
		Assert.assertEquals(str, "Facebook – log in or sign up");
	}

	@Test
	public void ValidateUrl()
	{
		String s= log.VerifyUrl();
		Assert.assertEquals(s, "https://www.facebook.com/");
	}

	@Test
	public void ValidateEmail()
	{
		log.VerifyEmail("infomats@gmail.com");
	}

	@Test
	public void ValidatePass()
	{
		log.VerifyPassword("admin12345");
	}


	@Test
	public void ValidateCreate()
	{
		log.Verifycreatenewaccount();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}