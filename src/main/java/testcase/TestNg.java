package testcase;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestNg {
	
	private static WebDriver driver = null;
	
	@BeforeClass
	public static void startWebdriver(){
		//driver = new FirefoxDriver();
		driver = new HtmlUnitDriver();
	}
	
	@Test
	public void testCase(){
		driver.get("http://google.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(),"Google1");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		driver.get("http://ar.yahoo.com/");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(),"Yahoo");


	}
	
	
	@AfterClass
	public static void stopWebdriver(){
		driver.close();
		driver.quit();
		if (driver != null)
			driver = null;
		
		
	}
	
	
}
