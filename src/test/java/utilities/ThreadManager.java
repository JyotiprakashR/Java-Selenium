package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import utilities.*;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

public class ThreadManager {

	private ThreadLocal<String> resultExcelPath = new ThreadLocal<>();

	// Method-Level variables
	private ThreadLocal<Map<String, String>> resultMap = new ThreadLocal<>();
	private ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

	// Method-Level: Test Result Variables
	private ThreadLocal<List<String>> testFailureMsg = new ThreadLocal<>();

	// Suite-level properties
	private ThreadLocal<String> browser = new ThreadLocal<>();
	private ThreadLocal<String> program = new ThreadLocal<>();
	private ThreadLocal<String> country = new ThreadLocal<>();
	private ThreadLocal<String> environment = new ThreadLocal<>();
	private ThreadLocal<String> dockerInit = new ThreadLocal<>();

	// Config properties
	private ThreadLocal<Properties> globalFWProp = new ThreadLocal<>();
	private ThreadLocal<Properties> globalTestProp = new ThreadLocal<>();
	private ThreadLocal<Properties> programFWProp = new ThreadLocal<>();
	private ThreadLocal<Properties> programTestProp = new ThreadLocal<>();

	// Object repo properties
	private ThreadLocal<Properties> globalObjProp = new ThreadLocal<>();
	private ThreadLocal<Properties> programObjProp = new ThreadLocal<>();

	// Payload properties
	private ThreadLocal<Properties> globalPayloadProp = new ThreadLocal<>();
	private ThreadLocal<Properties> programPayloadProp = new ThreadLocal<>();

	// Query properties
	private ThreadLocal<Properties> globalQueryProp = new ThreadLocal<>();
	private ThreadLocal<Properties> programQueryProp = new ThreadLocal<>();

	// DB variables
	private ThreadLocal<Connection> dssDBConnection = new ThreadLocal<>();

	// Project directory
	private static volatile Path projectDir = null;

	// Program Test Data
	private ThreadLocal<List<LinkedHashMap<String, String>>> programTestData = new ThreadLocal<>();

	// Shared static volatile data among threads
	private static volatile HashMap<String, List<LinkedHashMap<String, String>>> suiteThreadData = new HashMap<>();
	private static volatile HashMap<String, HashMap<String, String>> suiteProperties = new HashMap<>();
	private static volatile HashMap<String, String> suiteResultExcelPath = new HashMap<>();
	private static volatile HashMap<String, HashMap<String, Integer>> testExecutionDetails = new HashMap<>();
	private static volatile ArrayList<LinkedHashMap<String, String>> lastRunTestResults = new ArrayList<>();

	// ------------------------Getter and Setter
	// Methods--------------------------------------------//

	protected String getResultExcelPath() {
		return resultExcelPath.get();
	}

	protected void setResultExcelPath(String resultExcelPath) {
		this.resultExcelPath.set(resultExcelPath);
	}

	protected Map<String, String> getResultMap() {
		return resultMap.get();
	}

	protected void setResultMap(Map<String, String> resultMap) {
		this.resultMap.set(resultMap);
	}


	protected RemoteWebDriver getDriver() {
		return driver.get();
	}

	protected void setDriver(RemoteWebDriver driver) {
		this.driver.set(driver);
	}

	protected void setDbUtil(String program, Properties globalTestProp, Properties globalFWProp)
			throws SQLException, IOException, ClassNotFoundException {
		if (program != null) {
			// setup constructor only once for DB data source
			
		}
	}



	protected List<String> getTestFailureMsg() {
		return testFailureMsg.get();
	}

	protected void setTestFailureMsg(List<String> testFailureMsg) {
		this.testFailureMsg.set(testFailureMsg);
	}

	protected String getBrowser() {
		return browser.get();
	}

	protected void setBrowser(String browser) {
		this.browser.set(browser);
	}

	protected String getProgram() {
		return program.get();
	}

	protected void setProgram(String program) {
		this.program.set(program);
	}

	protected String getCountry() {
		return country.get();
	}

	protected void setCountry(String country) {
		this.country.set(country);
	}

	protected String getEnvironment() {
		return environment.get();
	}

	protected void setEnvironment(String environment) {
		this.environment.set(environment);
	}

	protected String getDockerInit() {
		return dockerInit.get();
	}

	protected void setDockerInit(String dockerInit) {
		this.dockerInit.set(dockerInit);
	}

	protected Properties getGlobalFWProp() {
		return globalFWProp.get();
	}

	protected void setGlobalFWProp(Properties globalFWProp) {
		this.globalFWProp.set(globalFWProp);
	}

	protected Properties getGlobalTestProp() {
		return globalTestProp.get();
	}

	protected void setGlobalTestProp(Properties globalTestProp) {
		this.globalTestProp.set(globalTestProp);
	}

	protected Properties getProgramFWProp() {
		return programFWProp.get();
	}

	protected void setProgramFWProp(Properties programFWProp) {
		this.programFWProp.set(programFWProp);
	}

	protected Properties getProgramTestProp() {
		return programTestProp.get();
	}

	protected void setProgramTestProp(Properties programTestProp) {
		this.programTestProp.set(programTestProp);
	}

	protected Properties getGlobalObjProp() {
		return globalObjProp.get();
	}

	protected void setGlobalObjProp(Properties globalObjProp) {
		this.globalObjProp.set(globalObjProp);
	}

	protected Properties getProgramObjProp() {
		return programObjProp.get();
	}

	protected void setProgramObjProp(Properties programObjProp) {
		this.programObjProp.set(programObjProp);
	}

	protected Properties getGlobalPayloadProp() {
		return globalPayloadProp.get();
	}

	protected void setGlobalPayloadProp(Properties globalPayloadProp) {
		this.globalPayloadProp.set(globalPayloadProp);
	}

	protected Properties getProgramPayloadProp() {
		return programPayloadProp.get();
	}

	protected void setProgramPayloadProp(Properties programPayloadProp) {
		this.programPayloadProp.set(programPayloadProp);
	}

	protected Properties getGlobalQueryProp() {
		return globalQueryProp.get();
	}

	protected void setGlobalQueryProp(Properties globalQueryProp) {
		this.globalQueryProp.set(globalQueryProp);
	}

	protected Properties getProgramQueryProp() {
		return programQueryProp.get();
	}

	protected void setProgramQueryProp(Properties programQueryProp) {
		this.programQueryProp.set(programQueryProp);
	}

	protected Path getProjectDir() {
		return projectDir;
	}

	protected void setProjectDir(Path projectDir) {
		this.projectDir = projectDir;
	}

	protected List<LinkedHashMap<String, String>> getProgramTestData() {
		return programTestData.get();
	}

	protected void setProgramTestData(List<LinkedHashMap<String, String>> programTestData) {
		this.programTestData.set(programTestData);
	}

	public static HashMap<String, List<LinkedHashMap<String, String>>> getSuiteThreadData() {
		return suiteThreadData;
	}

	public static void setSuiteThreadData(HashMap<String, List<LinkedHashMap<String, String>>> suiteThreadData) {
		ThreadManager.suiteThreadData = suiteThreadData;
	}

	public static HashMap<String, String> getSuiteResultExcelPath() {
		return suiteResultExcelPath;
	}

	public static void setSuiteResultExcelPath(HashMap<String, String> suiteResultExcelPath) {
		ThreadManager.suiteResultExcelPath = suiteResultExcelPath;
	}

	public static HashMap<String, HashMap<String, String>> getSuiteProperties() {
		return suiteProperties;
	}

	public static void setSuiteProperties(HashMap<String, HashMap<String, String>> suiteProperties) {
		ThreadManager.suiteProperties = suiteProperties;
	}

	public static HashMap<String, HashMap<String, Integer>> getTestExecutionDetails() {
		return testExecutionDetails;
	}

	public static void setTestExecutionDetails(HashMap<String, HashMap<String, Integer>> testExecutionDetails) {
		ThreadManager.testExecutionDetails = testExecutionDetails;
	}

	public static ArrayList<LinkedHashMap<String, String>> getLastRunTestResults() {
		return lastRunTestResults;
	}

	public static void setLastRunTestResults(ArrayList<LinkedHashMap<String, String>> lastRunTestResults) {
		ThreadManager.lastRunTestResults = lastRunTestResults;
	}

	public Connection getDSSDbConnection() {
		return dssDBConnection.get();
	}

	public void setDSSDbConnection(Connection dbConnection) {
		this.dssDBConnection.set(dbConnection);
	}

	// --------------------------Other-Methods---------------------------------------------------//

	/**
	 * Create page object at runtime
	 * 
	 * @param program
	 * @param className
	 * @param driver
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 */
	protected Object getPageObject(String program, String className, RemoteWebDriver driver)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException,
			InvocationTargetException {

		if (className.contains("Base"))
			className = className.replace("Base", "");
		className = program.toUpperCase() + className;
		Class cls = Class.forName("pages." + program.toLowerCase() + ".web." + className);
		Constructor[] ctr = cls.getDeclaredConstructors();
		return cls.getDeclaredConstructors()[0].newInstance(new Object[] { driver, getGlobalFWProp(),
				getProgramFWProp(), getGlobalTestProp(), getProgramTestProp(), getGlobalObjProp(), getProgramObjProp(),
				getGlobalQueryProp(), getProgramQueryProp(), getGlobalPayloadProp(), getProgramPayloadProp() });

	}

	protected String getSuiteName(ITestContext iTestContext) {
		return iTestContext.getCurrentXmlTest().getSuite().getName();
	}

}
