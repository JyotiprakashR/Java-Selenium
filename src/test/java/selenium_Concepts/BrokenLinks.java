package selenium_Concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrokenLinks {

	private WebDriver driver;
	private String browserName = "Chrome";
	private final String portalUrl = "https://www.t-mobile.com";

	@BeforeTest
	private void setUp() throws InterruptedException {
		launchBrowser(browserName, true);
		launchPortal(portalUrl);
	}

	@Test
	private void findBrokenLinks1() {
		int j = 1;
		ArrayList<String> arrayList = returnValidUrlList();
		for (String eachURL : arrayList) {
			try {
				HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(eachURL).openConnection();
				httpsURLConnection.setRequestMethod("GET");
				httpsURLConnection.setConnectTimeout(3000);
				httpsURLConnection.connect();
				if (httpsURLConnection.getResponseCode() > 399) {
					System.out.println("Broken Link--->" + httpsURLConnection.getURL() + "---->Response Code="
							+ httpsURLConnection.getResponseCode());
				} else {
					System.out.println("(" + j + ")." + httpsURLConnection.getURL() + "---->Response Code="
							+ httpsURLConnection.getResponseCode() + " & Message="
							+ httpsURLConnection.getResponseMessage());
					j++;
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private ArrayList<String> returnValidUrlList() {
		ArrayList<String> validArrayList = new ArrayList<>();
		ArrayList<String> brokenArrayList = new ArrayList<>();
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
		System.out.println("Invalid/Null/Broken Links are :" + brokenArrayList.size());
		int k = 1;
		for (String brokenLink : brokenArrayList) {
			System.out.println("(" + k + ")." + brokenLink);
			k++;
		}
		return validArrayList;
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
