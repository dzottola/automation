package helper;

public class WindowHelper extends StartWebDriver {

	public static void back(){
		driver.navigate().back();
	}
	
	public static void foward(){
		driver.navigate().forward();
	}
	
	public static void refresh(){
		driver.navigate().refresh();
	}
	
	public static void navigateToPage(String url){
		driver.navigate().to(url);
	}
}
