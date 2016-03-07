public class ReverseInteger {
	public static int reverse(int x) {
		int n = 0;
		if (x > 0) {
			String num = String.valueOf(x);
			char[] temp = new char[num.length()];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = num.charAt(i);
			}
			String result = "";
			for (int i = temp.length - 1; i >= 0; i--) {
				result = result + temp[i];
			}
			try {
				n = Integer.parseInt(result);
			} catch (NumberFormatException e) {
				n = 0;
			}
		} else {
			String num = String.valueOf(Math.abs(x));
			char[] temp = new char[num.length()];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = num.charAt(i);
			}
			String result = "-";
			for (int i = temp.length - 1; i >= 0; i--) {
				result = result + temp[i];
			}
			try {
				n = Integer.parseInt(result);
			} catch (NumberFormatException e) {
				n = 0;
			}
		}
		return n;
	}

	public static void main(String args[]) {
		System.out.println(reverse(-2147483648));
	}
}
