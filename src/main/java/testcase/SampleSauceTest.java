package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import java.net.URL;
 
public class SampleSauceTest {
 
  public static final String USERNAME = "zottola.diego";
  public static final String ACCESS_KEY = "717fa6c9-c022-4a80-a86e-da1044e36f20";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  
  public static void main(String[] args) throws Exception {
 
	  DesiredCapabilities caps = DesiredCapabilities.firefox();
	  caps.setCapability("platform", "Windows 10");
	  caps.setCapability("version", "41.0");
 
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
 
    /**
     * Goes to Sauce Lab's guinea-pig page and prints title
     */
 
    driver.get("https://s1hub.gpcloud.com/login");
	driver.findElement(By.className("email")).clear();
	driver.findElement(By.className("email")).sendKeys("diego.zottola@gpcloud.com");
	driver.findElement(By.cssSelector("input[name=\"password\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Enfermo@1");
    driver.findElement(By.xpath("//div[@id='main']/div[2]/div/form/div[4]/button")).click();
    java.lang.Thread.sleep(10000);
    driver.findElement(By.xpath("//*[@id='nav']/li[5]/a")).click();
    driver.findElement(By.xpath("//ul[@id='nav']/li[5]/ul/li[2]/a")).click();
    java.lang.Thread.sleep(10000);
    driver.quit();
  }
}