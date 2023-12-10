package testNG_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.ThreadManager;

public class DataProviderConcept extends ThreadManager {

	public WebDriver driver;
	public final String portalUrl = "https://emicalculator.site/";

	@Parameters({ "browser", "browserHeadlessFlag" })
	@BeforeMethod
	private void setUp(String browser, String browserHeadlessFlag) throws InterruptedException {
		launchBrowser(browser, browserHeadlessFlag);
		launchPortal(portalUrl);
	}

	@Test(dataProvider = "testData")
	public void dataProviderTest(LinkedHashMap<String, String> testData) throws InterruptedException { 
	
	// here we are writing LinkedHashMap<String, String> testData insteadOf Object testData. because of the following code snippet
	// LinkedHashMap<String, String> testData1 =(LinkedHashMap<String,String>)testData;

		performEMICal(testData);

	}

//	@Test(dataProvider = "testData")
//	public void dataProviderTest(Object testData) throws InterruptedException {
//		
//		LinkedHashMap<String, String> testData1 = (LinkedHashMap<String, String>) testData;
//		performEMICal(testData1);
//
//	}

	@DataProvider(name = "testData", parallel = false)
	public Object[][] getData() throws IOException {
		// file path where excel file placed, containing test data.
		String excelFilePath = "S:\\JavaEclipse\\HSC_Java-Selenium_Completed_HSC\\testdata.xlsx";

		FileInputStream fis = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		Object obj[][] = new Object[lastRowNum][1];
		for (int i = 0; i < lastRowNum; i++) {
			LinkedHashMap<String, String> lHashmap = new LinkedHashMap<>();
			for (int j = 0; j < lastCellNum; j++) {
				lHashmap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = lHashmap;
		}
		return obj;
	}

	private void launchPortal(String portalUrl) throws InterruptedException {
		driver.get(portalUrl);
		driver.manage().timeouts().getScriptTimeout();
		Thread.sleep(1000);
	}

	private void launchBrowser(String browserName, String headlessOptionalFlag) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			if (Boolean.parseBoolean(headlessOptionalFlag)) {
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--headless=chrome");
				driver = new ChromeDriver(chromeOptions);
			} else {
				driver = new ChromeDriver();
			}
		}
		if (browserName.equalsIgnoreCase("Mozila")) {
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	private void performEMICal(LinkedHashMap<String, String> testData) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='frm-emi']/p[1]/input")).sendKeys(testData.get("Amount"));
		driver.findElement(By.xpath("//*[@id='frm-emi']/p[2]/input")).sendKeys(testData.get("Intrest"));
		driver.findElement(By.xpath("//*[@id='frm-emi']/div/div/input")).sendKeys(testData.get("tenure"));
		driver.findElement(By.xpath("//*[@id='frm-emi']/p[3]/input")).click();
	}

	@AfterMethod
	private void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}

// 
//// calculate total number of rows and columns so that we can iterate over it.
//int totalRowCount = sheet.getLastRowNum() + 1;
//int totalColCount = sheet.getRow(0).getLastCellNum();
//// create an object array. which will store the test data from excel file
//Object[][] testData = new Object[totalRowCount][totalColCount];
//for (int i = 0; i < totalRowCount; i++) {
//	for (int j = 0; j < totalColCount; j++) {
//		testData[i][j] = sheet.getRow(i).getCell(j).toString();
//	}
//}