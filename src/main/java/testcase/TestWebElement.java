package testcase;


import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.ButtonHelper;
import helper.CheckBoxHelper;
import helper.LinkHelper;
import helper.StartWebDriver;
import helper.TextBoxHelper;

public class TestWebElement extends StartWebDriver{

	@Test
	public void findElemnt(){
		try {
			
			//LinkHelper.clickLink("Create a Page");
			
//			System.out.println("Selected: "+driver.findElement(By.id("u_0_g")).isSelected());
//			driver.findElement(By.id("u_0_g")).click();
//			System.out.println("Selected: "+driver.findElement(By.id("u_0_g")).isSelected());

//			System.out.println(""+CheckBoxHelper.isChecked("u_0_g"));
//			CheckBoxHelper.clickCheckBox("u_0_g");
//			System.out.println(""+CheckBoxHelper.isChecked("u_0_g"));
																
			ButtonHelper.clickButton("u_0_l");
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
}
