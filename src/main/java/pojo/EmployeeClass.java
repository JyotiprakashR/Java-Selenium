package pojo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeClass {

	private String fName;
	private String lName;
	private int age;
	private boolean isActive;
	private String location;

	EmployeeClass() {

	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

//	@Test
//	public void test() {
//		WebDriver driver = new ChromeDriver();
//		TakesScreenshot s = ((TakesScreenshot) driver);
//		File file= s.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"/screenshots/scrrenshot1.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
