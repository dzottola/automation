package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import helper.StartWebDriver;
import testcase.listener.CustomeWebDriverListener;

public class TestWebDriverListener extends StartWebDriver {

	@Test
	public void testCaseOne(){
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		CustomeWebDriverListener listener = new CustomeWebDriverListener();
		edriver.register(listener);
		edriver.navigate().to("https://landfill.bugzilla.org/bugzilla-5.0-branch/");
		edriver.findElement(By.xpath("//*[@id='enter_bug']/span")).click();
		
	}
	
}
