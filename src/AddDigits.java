public class AddDigits {
	public static int addDigits(int num) {
		String digit = num + "";
		int length = digit.length();
		int sum = 0;
		if (length != 1) {
			while (length != 1) {
				sum = 0;
				for (int i = 0; i < length; i++) {
					sum += Integer.parseInt(String.valueOf(digit.charAt(i)));
				}
				digit = sum + "";
				length = digit.length();
			}
			return (int) sum;
		} else
			return num;
	}

	// O(1)方法 数学计算得出
	// public int addDigits(int num) {
	// return 1 + (num-1) % 9;
	// }

	public static void main(String args[]) {
		System.out.println(addDigits(1));
	}
}