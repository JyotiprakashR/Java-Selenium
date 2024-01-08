package selenium_Concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BasePage;
import constants.Constants;
import utilities.CommonWebActions;
import utilities.FileReaderUtil;

public class WorkingLinks extends BasePage {

	@Test
	public static void test() throws IOException {
		CommonWebActions.getURL(driver, FileReaderUtil.getConfigProperty(Constants.URL));

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

		for (WebElement eachLink : allLinks) {
			String strUrl = eachLink.getAttribute("href");
			if (strUrl == null) {
				System.out.println("blank Link--" + strUrl);
			} else if (strUrl.contains("https://") == false) {
				System.out.println("Not secure Link--" + strUrl);
			} else {
				URL url = new URL(strUrl);
				HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setConnectTimeout(4000);
				connection.connect();
				if (connection.getResponseCode() == 200) {
					System.out.println("working link-" + url);
					System.out.println("content Type-" + connection.getContentType());

				}
				connection.disconnect();

			}

		}

	}

}
