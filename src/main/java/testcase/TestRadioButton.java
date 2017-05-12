package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

import helper.ButtonHelper;
import helper.LinkHelper;
import helper.StartWebDriver;
import helper.TextBoxHelper;

public class TestRadioButton extends StartWebDriver{
	
	@Test
	public void testRadioButton(){
		TextBoxHelper.typeInTextBox("email","zdie1@hotmail.com");
		TextBoxHelper.typeInTextBox("pass","31532254");
		System.err.println(driver.getTitle());

		ButtonHelper.clickButton("u_0_q");
		System.err.println(driver.getTitle());

		ButtonHelper.clickButton("_2s25>span");
		
		System.err.println(driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Diego"));
		driver.findElement(By.xpath(".//div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[@class='_6_7 clearfix']/a[4]")).click();
		System.err.println(driver.getTitle());

	}

}
