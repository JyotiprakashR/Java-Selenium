package testNG_Concepts;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportingConcept implements IReporter{

	// Will use Extent Report for the time bing here
	// have to add a maven dependency from relevant codes
	// So to create a report the extent report should listen  track out executor during run time
	// to make it haven we have to implement IReporter interface form testNG

	private ExtentReports extent;
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

		extent = new ExtentReports(outputDirectory + File.separator
				+ "Extent.html", false);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			}
		}

		extent.flush();
		extent.close();
		try {
			// this code will open the report automatically once the execution completed
			//Desktop.getDesktop().browse(new URI(outputDirectory + File.separator+"Extent.html"));
			Desktop.getDesktop().browse(new URI(System.getProperty("user.dir")+"/test-output/Extent.html"));
			File file = new File("System.getProperty(\"user.dir\")+\"/test-output/Extent.html\"");
			URI uri = file.toURI();
			Desktop.getDesktop().browse(uri);
			
			
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

	}

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.endTest(test);
			}
		}
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}


}
