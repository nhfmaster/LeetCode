public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		boolean flag = false;
		if (x < 0) {
			flag = false;
		} else {
			String num = String.valueOf(x);
			char[] temp1 = new char[num.length()];
			char[] temp2 = new char[num.length()];
			for (int i = 0; i < temp1.length; i++) {
				temp1[i] = num.charAt(i);
			}
			for (int i = 0; i < temp1.length; i++) {
				temp2[i] = temp1[temp1.length - 1 - i];
			}
			for (int i = 0; i < temp1.length; i++) {
				if (temp1[i] == temp2[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String args[]) {
		System.out.println(isPalindrome(1000021));
	}
}
