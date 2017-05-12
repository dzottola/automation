package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.GenericHelper;
import helper.StartWebDriver;

public class TestDisplayed extends StartWebDriver{
	
	@Test
	public void checkElement(){
		System.out.println("Displayed"+driver.findElement(By.linkText("Home")).isDisplayed());
		System.out.println("Is Element Present:"+GenericHelper.isElementPresent("quicksearch_top"));
		System.out.println("Is Element Present:"+GenericHelper.isElementPresent("quicksearch_to_p"));

	}
}
