package helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class StartWebDriver extends ElementRepository {

	// Saucelabs config
	public static final String USERNAME = "zottola.diego";
	public static final String ACCESS_KEY = "717fa6c9-c022-4a80-a86e-da1044e36f20";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static WebDriver driver = null;
	public static ReadConfigProperty file = null;

	@BeforeTest
	public void startSaucelabs() throws MalformedURLException {
		try {
			DesiredCapabilities caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "31.0");
			driver = new RemoteWebDriver(new URL(URL), caps);
			file = new ReadConfigProperty();
			driver.get(file.getUrl());
			PageFactory.initElements(driver, ElementRepository.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void setUp() {
	// try {
	//
	// file = new ReadConfigProperty();
	// if ("firefox".equalsIgnoreCase(file.getBrowser())) {
	// driver = new FirefoxDriver();
	// } else if ("chrome".equalsIgnoreCase(file.getBrowser())) {
	// System.setProperty("webdriver.chrome.driver",
	// StartWebDriver.class.getClassLoader().getResource("resource/chromedriver.exe").getPath());
	// driver = new ChromeDriver();
	//
	// } else if ("explorer".equalsIgnoreCase(file.getBrowser())) {
	// System.setProperty("webdriver.ie.driver",
	// StartWebDriver.class.getClassLoader().getResource("resource/IEDriverServer.exe").getPath());
	// driver = new InternetExplorerDriver();
	// } else {
	// driver = new HtmlUnitDriver();
	// }
	// driver.get(file.getUrl());
	// PageFactory.initElements(driver, ElementRepository.class);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public static WebElement getElement(String locator) {
		boolean flag = false;
		if (locator.contains("/"))
			flag = true;
		if (driver.findElements(By.id(locator)).size() == 1) {
			return driver.findElement(By.id(locator));
		} else if (driver.findElements(By.className(locator)).size() == 1) {
			return driver.findElement(By.className(locator));
		} else if (driver.findElements(By.name(locator)).size() == 1) {
			return driver.findElement(By.name(locator));
		} else if (!flag && driver.findElements(By.cssSelector(locator)).size() == 1) {
			return driver.findElement(By.cssSelector(locator));
		} else if (driver.findElements(By.xpath(locator)).size() == 1) {
			return driver.findElement(By.xpath(locator));
		} else
			throw new NoSuchElementException("No Such Element:" + locator);
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		try {
			driver.close();
			driver.quit();
			if (driver != null)
				driver = null;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
