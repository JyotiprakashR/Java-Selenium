package selenium_Concepts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrokenLinks {

	private WebDriver driver;
	private String browserName = "Chrome";

	private final String portalUrl = "https://www.t-mobile.com";

	@BeforeTest
	private void setUp() throws InterruptedException {
		launchBrowser(browserName);
		launchPortal(portalUrl);
	}

	@Test
	private void findBrokenLinks1() {
		int j = 1;
		
		Map<String, LinkedList<String>> validAndBrokenMap = returnValidUrlList();
		LinkedList<String> brokenArrayList = validAndBrokenMap.get("brokenArrayList");
		LinkedList<String> validArrayList = validAndBrokenMap.get("validArrayList");
		for (String eachURL : validArrayList) {
			try {
				HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(eachURL).openConnection();
				httpsURLConnection.setRequestMethod("GET");
				httpsURLConnection.setConnectTimeout(3000);
				httpsURLConnection.connect();
				if (httpsURLConnection.getResponseCode() > 399) {
					System.out.println("Broken Link--->" + httpsURLConnection.getURL() + "---->Response Code="
							+ httpsURLConnection.getResponseCode());
					brokenArrayList.add(httpsURLConnection.getURL().toString());
				} else {
//					System.out.println("(" + j + ")." + httpsURLConnection.getURL() + "---->Response Code="
//							+ httpsURLConnection.getResponseCode() + " & Message="
//							+ httpsURLConnection.getResponseMessage());
					j++;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Total Broken links are " + brokenArrayList.size());
		System.out.println("Broken links are " + brokenArrayList);
	}

	@AfterTest
	private void tearDown() {
		driver.quit();
	}

	private Map<String, LinkedList<String>> returnValidUrlList() {
		Map<String, LinkedList<String>> validAndBrokenMap = new LinkedHashMap<>();
		LinkedList<String> validArrayList = new LinkedList<>();
		LinkedList<String> brokenArrayList = new LinkedList<>();
		List<WebElement> allLinks = getAllLinks();
		for (WebElement eachLink : allLinks) {
			try {
				if (eachLink.getAttribute("href") == null) {
					brokenArrayList.add(null);
				} else if (eachLink.getAttribute("href").toString().contains("https://") == false) {
					brokenArrayList.add(eachLink.getAttribute("href").toString());
				} else {
					URL url = new URL(eachLink.getAttribute("href"));
					validArrayList.add(url.toString());

				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}

		validAndBrokenMap.put("brokenArrayList", brokenArrayList);
		validAndBrokenMap.put("validArrayList", validArrayList);
		return validAndBrokenMap;
	}

	private List<WebElement> getAllLinks() {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links size : " + allLinks.size());
		return allLinks;
	}

	private void launchBrowser(String browserName, Boolean... headlessOptionalFlag) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			if (headlessOptionalFlag.length > 0) {
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

	private void launchPortal(String portalUrl) throws InterruptedException {
		driver.get(portalUrl);
		driver.manage().timeouts().getScriptTimeout();
		Thread.sleep(5000);
	}

}
