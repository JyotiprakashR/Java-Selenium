package java_Concepts;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

public class TwoDimensionalArrayConcept {

	@Test
	public void TwoDimensionalArrayConceptTest() {

		oneDimObjectArray();
		twoDimObjectArray();

		int number[] = { 10, 20, 30, 40, 50 }; // 1-D array
		System.out.println(number.length);
		System.out.println(number[0]);

		int intArr[] = new int[5];

		// 2-D int array
		int num1[][] = { { 10, 50 }, { 20 }, { 30 } };
		int num[][] = new int[2][2];

		int row = 3;
		int col = 3;
		int value = 30;
		int arrTwo[][] = new int[3][3];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arrTwo[i][j] = value;
				value++;
			}
		}
		// printing arrTwo--2D array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arrTwo[i][j] + "-");
			}
			System.out.println("");
		}

	}

	public Object[] oneDimObjectArray() {

		// 1-D Object array
		Object objOneD[] = new Object[6];
		Integer intInterger = Integer.valueOf(20);
		objOneD[0] = intInterger;
		String string = "hello";
		objOneD[1] = string;

		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(11);
		arrInt.add(21);
		arrInt.add(31);
		objOneD[2] = arrInt.get(0);
		objOneD[3] = arrInt;
		objOneD[4] = 22.56;

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Score1", 60);
		hashMap.put("Score2", 70);
		hashMap.put("Score3", 80);

		objOneD[5] = hashMap;
		System.out.println(objOneD[0]);
		for (Object obj : objOneD) {
			System.out.println(obj.toString());
		}

		Integer intOneDA[] = new Integer[5];
		Integer intInterger1 = Integer.valueOf(50);
		intOneDA[0] = intInterger1;

		return objOneD;
	}

	public void twoDimObjectArray() {

		// 2-D Object array
		Object objArry[][] = new Object[2][2]; // [[null, null, null], [null, null, null], [null, null, null]]
		Object objArray1[][]; // nothing as no one is holding this object nor anything is assigned--so omitted
								// this line
		Object objArray2[][] = null; // null
		Object objArray3[][] = {}; // []
		Object objArray4[][] = { { 12, 22, 32 }, { 42, 52, 62 }, { 72, 82, 92 } }; // [[12, 22, 32], [42, 52, 62], [72,
																					// 82, 92]]

		// 2-D object array storing Object values
		Object objArry5[][] = new Object[3][3];
		Integer interger = Integer.valueOf(23);
		objArry5[0][0] = interger;
		Integer interger1 = Integer.valueOf(13);
		objArry5[0][1] = interger1;

		objArry5[1][0] = 33;
		objArry5[1][1] = 43;
		
		Object[][] twoDimObjArr=new Object[3][2];
		String s="hello";
		Integer integer=Integer.valueOf(20);
		Float float1= Float.valueOf((float) 25.36);
		
		twoDimObjArr[0][0]=41;
		twoDimObjArr[0][1]=s;
		twoDimObjArr[1][0]=integer;
		twoDimObjArr[1][1]=float1;
		
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(11);
		arrInt.add(21);
		arrInt.add(31);
		
		twoDimObjArr[2][0]=arrInt;

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Score1", 60);
		hashMap.put("Score2", 70);
		hashMap.put("Score3", 80);

		twoDimObjArr[2][1]=hashMap;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(twoDimObjArr[i][j]+" ");
			}
			System.out.println();
		}
		
		int[] iac=new int[3];
		iac[0]=1;
		iac[1]=2;
		iac[2]=3;
		
		Object[] objarrayiac=new Object[3];
		objarrayiac[0]=iac;
		System.out.println(objarrayiac[0].toString());
	}
}
