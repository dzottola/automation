package helper;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class StartWebDriver {

	public static WebDriver driver = null;
	
	@BeforeSuite
	public void setUp(){
		try {
			
			ReadConfigProperty file = new ReadConfigProperty();
			if ("firefox".equalsIgnoreCase(file.getBrowser())){
				driver = new FirefoxDriver();
			}else if ("chrome".equalsIgnoreCase(file.getBrowser())) {
				System.setProperty("webdriver.chrome.driver",StartWebDriver.class.getClassLoader().getResource("resource/chromedriver.exe").getPath());
				driver = new ChromeDriver();
			
			}else if ("explorer".equalsIgnoreCase(file.getBrowser())) {
				System.setProperty("webdriver.ie.driver",StartWebDriver.class.getClassLoader().getResource("resource/IEDriverServer.exe").getPath());
				driver = new InternetExplorerDriver();
			}else{
				driver = new HtmlUnitDriver();
			}
			driver.get(file.getUrl());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static WebElement getElement(String locator){
		boolean flag = false;
		if (locator.contains("/"))
			flag = true;
		if(driver.findElements(By.id(locator)).size() == 1){
			return driver.findElement(By.id(locator));
		}else if (driver.findElements(By.className(locator)).size() == 1){
			return driver.findElement(By.className(locator));
		}else if (driver.findElements(By.name(locator)).size() == 1){
			return driver.findElement(By.name(locator));
		}else if (!flag && driver.findElements(By.cssSelector(locator)).size() == 1){
			return driver.findElement(By.cssSelector(locator));
		}else if (driver.findElements(By.xpath(locator)).size() == 1){
			return driver.findElement(By.xpath(locator));
		}else
			throw new NoSuchElementException("No Such Element:"+locator);
	}
	
//	@AfterSuite(alwaysRun=true)
//	public void tearDown(){
//		try {
//			driver.close();
//			driver.quit();
//			if(driver != null)
//				driver = null;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	
//	}
	
	
}
