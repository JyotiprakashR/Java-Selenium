package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForLoopConcept {

	public static void main(String[] args) {

//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());

		Scanner s = new Scanner(System.in);
		int N = 2;

		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}

		s.close();
		// bufferedReader.close();

	}

}
