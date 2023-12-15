package testNG_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAndMapConcepts {

	// -------------------------------------------------------------------------------//
	@DataProvider
	public String[] getData() {
		String names[] = { "Tom", "Helly", "Ruby", "Lina" };
		return names;
	}

	@Test(dataProvider = "getData")
	public void method1(String[] name) {
		System.out.println("from method1--" + name[0].toString());
	}

	@Test(dataProvider = "getData")
	public void method2(String name) {
		System.out.println("from method2--" + name.toString());
	}
	// -------------------------------------------------------------------------------//

	@DataProvider
	public Integer[] getData1() {
		Integer names[] = { 10, 20, 30 };
		return names;
	}

	@Test(dataProvider = "getData1")
	public void method3(int name) {
		System.out.println("from method3--" + name);
	}

	@Test(dataProvider = "getData1")
	public void method4(int[] name) {
		System.out.println("from method4--" + name[0]);
	}

	// -------------------------------------------------------------------------------//

	@DataProvider
	public Object[][] getData2() {
		Object[][] names = { { 20 }, { 50 } };
		return names;
	}

	@Test(dataProvider = "getData2")
	public void method5(int[] name) {
		System.out.println("from method5--" + name[0]);
	}

	@Test(dataProvider = "getData2")
	public void method6(int name) {
		System.out.println("from method6--" + name);
	}

	@Test(dataProvider = "getData2")
	public void method7(Integer[] name) {
		System.out.println("from method7--" + name[0]);
	}

	// -------------------------------------------------------------------------------//

	@DataProvider
	public Object[][] getData3() {
		Object[][] names = { { 20, 30 }, { 40, 50 } };
		return names;
	}

	@Test(dataProvider = "getData3")
	public void method8(Integer name) { // Data provider mismatch---as
		// Method: method8([Parameter{index=0, type=java.lang.Integer,
		// declaredAnnotations=[]}])---Test method receding with this parameter
		// Arguments: [(java.lang.Integer)20,(java.lang.Integer)30]----returning from
		// Dataprovider method
		System.out.println(name);
		// System.out.println("from method8==" + name[0] +" "+name[1]);
	}

	@Test(dataProvider = "getData3")
	public void method9(Integer name, Integer nam) {
		System.out.println(name + " " + nam);
		// System.out.println("from method9==" + name[0] +" "+name[1]);
	}

	@Test(dataProvider = "getData3")
	public void method10(Integer name[]) {
		System.out.println("from method10==" + name[0] + " " + name[1]);
	}

	@Test(dataProvider = "getData3")
	public void method11(ArrayList<Integer> name) {
		System.out.println("from method11==" + name.get(0));
		/*
		 * will throw error as, Dataprovider is returning in array format Data provider
		 * mismatch Method: method11([Parameter{index=0, type=java.util.ArrayList,
		 * declaredAnnotations=[]}]) Arguments:
		 * [(java.lang.Integer)20,(java.lang.Integer)30]
		 */
	}

	// -------------------------------------------------------------------------------//

	@DataProvider
	public Object[][] getData4() {
		Object[][] names = new Object[1][1];
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(60);
		names[0][0] = al;
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(70);
		al1.add(80);
		al1.add(90);
		al.addAll(al1);
		// names[0][1] = al1;
		return names;
	}

	@Test(dataProvider = "getData4")
	public void method12(ArrayList<Integer> name, ArrayList<Integer> name1) {
		System.out.println("----");
		System.out.println("from method12==" + name.get(0) + " " + name.get(1) + " " + name.get(2));
		System.out.println("from method12==" + name1.get(0) + " " + name1.get(1) + " " + name1.get(2));
	}

	@Test(dataProvider = "getData4")
	public void method13(ArrayList<Integer> name) {
		System.out.println("----");
		System.out.println("from method13==" + name.get(0) + " " + name.get(1) + " " + name.get(2) + name.get(3) + " "
				+ name.get(4) + " " + name.get(5));
	}

	// -------------------------------------------------------------------------------//
	@Test
	public void test(ITestContext iTestContext) {
		ITestNGMethod[] iTestNGMethods = iTestContext.getAllTestMethods(); // All the test methods that were run.
		System.out.println(iTestNGMethods.length);
	}

	// -------------------------------------------------------------------------------//

	@DataProvider(name = "testData5", parallel = false)
	public Object[][] getData5() {
		Object[][] names = new Object[3][1];
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("fName", 20);
		map.put("lName", 30);
		Map<String, Integer> map1 = new LinkedHashMap<>();
		map1.put("fName", 40);
		map1.put("lName", 60);
		Map<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("fName", 80);
		map2.put("lName", 90);
		names[0][0] = map;
		names[1][0] = map1;
		names[2][0] = map2;

		return names;
	}

	@Test(dataProvider = "testData5")
	public void method14(LinkedHashMap<String, Integer> lHmap) {
		System.out.println("Thread id--" + Thread.currentThread().getId());
		for (Entry<String, Integer> entry : lHmap.entrySet()) {
			System.out.println(entry);
			// System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// ---------------------------------------------------------------------------------//
	@DataProvider
	public Employee[] objectFromEmployeeClass() {
		// we can write below as well.
//		return new Employee[] {
//		new Employee("Tom", "20"),
//		new Employee("Lila", "30"),
//		new Employee("Jerry", "40")
//}; 

		Integer[] inte = new Integer[4];
		Employee[] empo = new Employee[3]; // like the above line, we can create Employee class array

		Employee e1 = new Employee("Tom", "20");
		Employee e2 = new Employee("Tom", "40");
		Employee e3 = new Employee("Tom", "60");

		empo[0] = e1;
		empo[1] = e2;
		empo[2] = e3;

		return empo;

//		Employee[] empooo= {new Employee("Tom", "20"),
//				new Employee("Tom", "40"),
//				new Employee("Tom", "60"),
//		};
//		return empooo;

	}

	@Test(dataProvider = "objectFromEmployeeClass")
	public void objectFromEmployeeClassTest(Employee emp) {
		System.out.println("Thread Id--" + Thread.currentThread().getId() + " & Emp Name--" + emp.getName() + " & Id--"
				+ emp.getId());

	}

	// ---------------------------------------------------------------------------------//
	@DataProvider(name = "testData7", parallel = true, indices = {1,2}) // // here we can use one-D/2-D object Array
	public Object[] getData7() {		// indices = {1,2}--means only 1 & 2index values will be given by @Dataprovider to @Test method
		Object[] data = null;

		try {
			// reading file from directory, reading workbook & sheet
			System.out.println("userDirectory--" + System.getProperty("user.dir"));
			File file = new File(System.getProperty("user.dir") + "/src/test/resources/excelFiles/testdata.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet2");

			// reading no of rows & cols
			System.out.println("getPhysicalNumberOfRows--" + sheet.getPhysicalNumberOfRows());
			int totalNoOfRows = sheet.getLastRowNum();
			System.out.println("getLastRowNum--" + totalNoOfRows);
			int totalNoOfCols = sheet.getRow(0).getLastCellNum();
			System.out.println("getLastCellNum--" + totalNoOfCols);
			data = new Object[totalNoOfRows];
			for (int i = 0; i < totalNoOfRows; i++) {
				Map<String, String> map = new LinkedHashMap<>();
				for (int j = 0; j < totalNoOfCols; j++) {
					map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
				}
				data[i] = map;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("print");
		}
		return data;

	}

	@DataProvider(name = "testData6", parallel = false)
	public Object[][] getData6() { // // here we can use one-D/2-D object Array
		Object[][] data = null;

		try {
			// reading file from directory, reading workbook & sheet
			System.out.println("userDirectory--" + System.getProperty("user.dir"));
			File file = new File(System.getProperty("user.dir") + "/src/test/resources/excelFiles/testdata.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet2");

			// reading no of rows & cols
			System.out.println("getPhysicalNumberOfRows--" + sheet.getPhysicalNumberOfRows());
			int totalNoOfRows = sheet.getLastRowNum();
			System.out.println("getLastRowNum--" + totalNoOfRows);
			int totalNoOfCols = sheet.getRow(0).getLastCellNum();
			System.out.println("getLastCellNum--" + totalNoOfCols);
			data = new Object[totalNoOfRows][1];
			for (int i = 0; i < totalNoOfRows; i++) {
				Map<String, String> map = new LinkedHashMap<>();
				for (int j = 0; j < totalNoOfCols; j++) {
					map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
				}
				data[i][0] = map;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("print");
		}
		return data;

	}

	@Test(dataProvider = "testData6") // here we can use one-D/2-D object Array
	public void method15(LinkedHashMap<String, String> map) {
		for (Entry<String, String> entr : map.entrySet()) {
			System.out.println(entr);
		}
		System.out.println("Thread iD--" + Thread.currentThread().getId());
	}

}
