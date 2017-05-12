package testcase;

import org.testng.annotations.*;

public class TestNg2 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("++++++++++++++Before Class++++++++++++++");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("++++++++++++++After Class++++++++++++++");
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("++++++++++++++Before Method++++++++++++++");
	}
	@AfterMethod
	public static void afterMethod() {
		System.out.println("++++++++++++++After Method++++++++++++++");
	}
	
	@Test
	public static void testCase(){
		System.out.println("Test Case 1");
	}
	
	@Test
	public static void testCase2(){
		System.out.println("Test Case 2");
	}
	
	
}
