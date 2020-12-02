package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.Testutil;

public class Testbase 
{
	File f; 
	FileInputStream fis;
	Properties pro;
	public static WebDriver driver;

	public Testbase()
	{
		try
		{
			f=new File("C:\\Users\\Elcot\\eclipse-workspace\\simpleproject\\src\\main\\java\\config\\config.properties");
			fis =new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void Open()
	{
		String browser=pro.getProperty("browsername");

		if(browser.equalsIgnoreCase("Chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));
			driver =new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("Firefox"))
		{
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", pro.getProperty("geckopath"));
			driver =new FirefoxDriver();
		}

		else
		{
			System.out.println("Given browsername is wrong");
		}

		driver.get(pro.getProperty("url"));
		Testutil.Maximize();
		Testutil.Implicitwait();
		

	}
}
