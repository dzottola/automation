package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirtTestCase {

	public static void main(String[] args) {
//		FirefoxDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\diego\\Downloads\\SeleniumCouse\\IEDriverServer.exe");
//		InternetExplorerDriver driver2 = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Downloads\\SeleniumCouse\\chromedriver.exe");
		ChromeDriver driver3 = new ChromeDriver();
	}

}
