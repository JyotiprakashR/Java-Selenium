package interviewQsts;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(15));
		System.out.println(isArmstrong(1));
		System.out.println(isArmstrong(1634));
		System.out.println(isArmstrong(1634));
		System.out.println(isArmstrong(54748));

	}

	public static boolean isArmstrong(int num) {

		// 153
		int temp = num;
		int temp1 = num;
		int lenght = 0;
		while (num > 0) {
			lenght++;
			num = num / 10;
		}
		// System.out.println("length--"+lenght);
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum = (int) (sum + Math.pow(rem, lenght));
			temp = temp / 10;
		}
		if (temp1 == sum)
			return true;
		return false;

	}
}
