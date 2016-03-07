public class PlusOne {
	public static int[] plusOne(int[] digits) {
		String[] divide = new String[digits.length];
		int[] result = new int[digits.length];
		int number = 0;
		int length = digits.length;
		for (int i = 0; i < digits.length; i++) {
			number = (int) (number + digits[i] * Math.pow(10, --length));

		}
		int newNumber = number + 1;
		String newNumberString = String.valueOf(newNumber);
		System.out.println(newNumberString);
		for (int i = 0; i < digits.length; i++) {
			divide[i] = newNumberString.charAt(i) + "";
			result[i] = Integer.parseInt(divide[i]);
		}
		return result;
	}

	public static void main(String args[]) {
		int[] num;
		int[] test = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		num = plusOne(test);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
