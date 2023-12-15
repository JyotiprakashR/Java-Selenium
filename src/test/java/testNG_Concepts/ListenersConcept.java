package testNG_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class ListenersConcept implements IMethodInterceptor {

	// this class will implement MethodIntercepter interface

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {

//		for(IMethodInstance eachTest : methods) {
//			System.out.println("Test class method name--"+eachTest.getMethod().getMethodName().toString());
//		}
//		Test class method name--launchBrowser
//		Test class method name--launchportal
//		Test class method name--verifyLogo
//		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
//		result.add(methods.get(0));
//		System.out.println("-----" + result);
		LinkedHashMap<String, String> hashmap = null;
		String key = null;
		String value = null;
		List<Map<String, String>> listOfMap = new ArrayList<>();
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		try {
			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/test/resources/excelFiles/testData.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet3");
			int totalNoRows = sheet.getLastRowNum();
			int totalNoCols = sheet.getRow(0).getLastCellNum();
			for (int i = 0; i < totalNoRows; i++) {
				hashmap = new LinkedHashMap<>();
				for (int j = 0; j < totalNoCols; j++) {
					key = sheet.getRow(0).getCell(j).toString();
					value = sheet.getRow(i + 1).getCell(j).toString();
					hashmap.put(key, value);
				}
				listOfMap.add(hashmap);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < methods.size(); i++) {
			for (int j = 0; j < listOfMap.size(); j++) {
				if (methods.get(i).getMethod().getMethodName().equalsIgnoreCase(listOfMap.get(j).get("methodName"))) {
					result.add(methods.get(i));
				}
			}
		}

		return result;
	}

}
