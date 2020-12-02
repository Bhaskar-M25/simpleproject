package util;

import java.util.concurrent.TimeUnit;
import base.Testbase;

public class Testutil extends Testbase
{
	public static void Maximize()
	{
		driver.manage().window().maximize();
	}

	public static void Implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
