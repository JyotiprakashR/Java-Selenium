package testNG_Concepts;

import org.testng.annotations.*;

public class TestNG_Annotations {
	
	// TestNG Annotations sequence
	/***
setup---@BeforeSuite
login---@BeforeTest
Launch browser---@BeforeClass
enter url---@BeforeMethod
Test method1
logOut---@AfterMethod
enter url---@BeforeMethod
Test method2---@Test
logOut---@AfterMethod
enter url---@BeforeMethod
Test method3---@Test
logOut---@AfterMethod
close browser---@AfterClass
delete cookies---@AfterTest
	 */

	@BeforeSuite
	public void setUp() {
		System.out.println("setup---@BeforeSuite");
	}
	@BeforeTest
	public void login() {
		System.out.println("login---@BeforeTest");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser---@BeforeClass");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter url---@BeforeMethod");
	}
	
	@Test
	public void TestM1() {
		System.out.println("Test method1");
	}
	@Test
	public void TestM2() {
		System.out.println("Test method2---@Test");
	}
	@Test
	public void TestM3() {
		System.out.println("Test method3---@Test");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("logOut---@AfterMethod");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser---@AfterClass");
	}
	@AfterTest
	public void deleteCookies() {
		System.out.println("delete cookies---@AfterTest");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate Test Report---@AfterSuite");
	}
	@BeforeGroups
	public void groupBeforeTest() {
		System.out.println("BeforeGroup Test---@BeforeGroups");
	}
	
	@AfterGroups
	public void groupTest() {
		System.out.println("AfterGroup test---@AfterGroups");
	}
}
