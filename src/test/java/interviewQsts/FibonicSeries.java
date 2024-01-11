package interviewQsts;

public class FibonicSeries {

	public static void main(String[] args) {
		// 0,1->1
		// 1,1->2
		// 1,2->3
		// 2,3->5
		// 3,5->8
		// 5,8->13
		// 8,13->21
		// 13,21->34
		fibonicSeries(10);
	}

	private static void fibonicSeries(int numOfIteration) {
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= numOfIteration; i++) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			if (num3 > 500) {
				break;
			}
		}

	}

}
