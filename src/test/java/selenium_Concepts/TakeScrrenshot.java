package selenium_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScrrenshot {

	public WebDriver driver;

	@Test
	public void TakeScrrenshotTest() {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		boolean flag = false;
		if (flag) {
			System.out.println("printing");
		} else {

			try {
				File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String path = System.getProperty("user.dir") + "/screenshots/scrrenshot1.png";
				FileUtils.copyFile(file, new File(path));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
