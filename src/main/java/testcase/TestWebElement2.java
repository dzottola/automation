package testcase;


import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.StartWebDriver;

public class TestWebElement2 extends StartWebDriver{

	@Test
	public void findElemnt(){
		try {
			driver.findElement(By.id("email"));
			driver.findElement(By.className("inputtext"));
			driver.findElement(By.cssSelector("#pass"));
			driver.findElement(By.linkText("Create a Page"));
			driver.findElement(By.name("lastname"));
			driver.findElement(By.tagName("div"));
			driver.findElement(By.xpath("//*[@name='email']"));
			List<WebElement> list = driver.findElements(By.tagName("div"));
			System.out.println("Size: "+list.size());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
}
