package com.mavenproject;
 
import java.util.concurrent.TimeUnit;
//--
import org.openqa.selenium.By;
//--
import org.openqa.selenium.WebDriver;
//--
import org.openqa.selenium.WebElement;
//--
import org.openqa.selenium.firefox.FirefoxDriver;
//--
import org.testng.Assert;
//--
import org.testng.annotations.AfterClass;
//--
import org.testng.annotations.BeforeClass;
//--
import org.testng.annotations.Test;
 
public class LoadTest01 {
 
    private WebDriver driver;
 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
    }
 
//    @AfterClass
//    public void afterClass() {
//        driver.quit();
//    }
 
    @Test
    public void verifySearchButton() {
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("starting est");

        driver.get("https://thepracticalsysadmin.com/setting-up-a-github-webhook-in-jenkins/");
        String search_text = "Buscar  Google";
        WebElement search_button = driver.findElement(By.name("btnK"));
 
        String text = search_button.getAttribute("value");
        System.out.println("closing est");

        Assert.assertEquals(text, search_text, "Text not found!");
    }
}