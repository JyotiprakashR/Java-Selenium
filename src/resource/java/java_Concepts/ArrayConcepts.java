package java_Concepts;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class ArrayConcepts {

	@Test
	public void test() {
		int i[] = new int[4];
		System.out.println(i[2]);
		System.out.println(i.length);

		int j[] = {};
		System.out.println(j.length);

		// Object Array
		System.out.println("----------------------------------------");
		Object objArr[] = new Object[5];
		objArr[0] = "Hello";
		objArr[1] = 123;
		objArr[2] = 12.45;
		objArr[3] = 123654789;
		objArr[4] = true;
		System.out.println(objArr.length);
//		try {
//			objArr[5]=false;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}

		for (Object ob : objArr) {
			System.out.println(ob);
		}

		System.out.println("-------------------2D Array------------------");
		System.out.println("-------------------2D Array------------------");
		System.out.println("-------------------2D Array------------------");

		int twoDArray[][] = new int[3][2];
		System.out.println("Total no of rows : " + twoDArray.length); // will give you total rows are present
		System.out.println("Total no of columns : " + twoDArray[0].length); // will give you total columns are present
		// 1st row
		twoDArray[0][0] = 5;
		twoDArray[0][1] = 15;
		// 2nd row
		twoDArray[1][0] = 25;
		twoDArray[1][1] = 35;
		// 3rd row
		twoDArray[2][0] = 45;
		twoDArray[2][1] = 55;
		// System.out.println(twoDArray[0][0]);
		for (int[] a : twoDArray) {
			for (int b : a) {
				System.out.println(b);
			}
		}
		System.out.println("-----------------");
		for (int row = 0; row < twoDArray.length; row++) {
			for (int col = 0; col < twoDArray[0].length; col++) {
				System.out.println("[" + row + "][" + col + "]---" + twoDArray[row][col]);
			}
		}

		System.out.println("-------------------2D Object Array------------------");
		System.out.println("-------------------2D Object Array------------------");
		System.out.println("-------------------2D Object Array------------------");

		Object objA[][]=test1();
	}

	@Test
	public Object[][] test1() {
		Object data[][] = null;
		data = new Object[4][3];

		// 1st row
		data[0][0] = "Hello";
		data[0][1] = "Welcome";
		data[0][2] = "TO";

		// 2nd row
		data[1][0] = 10;
		data[1][1] = 20;
		data[1][2] = 30;

		// 3rd row
		data[2][0] = 14.5;
		data[2][1] = 15.6;
		data[2][2] = 17.8;

		// 4th row
		data[3][0] = true;
		data[3][1] = false;
		data[3][2] = null;
		

		LinkedHashMap<String, String> testData = new LinkedHashMap<>();
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[0].length; col++) {
				System.out.println("[" + row + "][" + col + "]---" + data[row][col]);
				//testData.put("[" + row + "][" + col + "]", (String) data[row][col]);
			}
		}
		
		return data;
	}

}
