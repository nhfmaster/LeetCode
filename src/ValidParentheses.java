public class ValidParentheses {
	public static boolean isValid(String s) {
		if (s.length() == 1) {
			return false;
		} else {
			boolean flag = true;
			char pattern1 = ')';
			char pattern2 = '}';
			char pattern3 = ']';
			int length = s.length();
			char[] string = new char[length];
			for (int i = 0; i < length; i++) {
				string[i] = s.charAt(i);
			}
			for (int i = 0; i < length - 1;) {
				char word = string[i];
				switch (word) {
				case '(':
					if (string[i + 1] != pattern1)
						flag = false;
					break;
				case '{':
					if (string[i + 1] != pattern2)
						flag = false;
					break;
				case '[':
					if (string[i + 1] != pattern3)
						flag = false;
					break;
				}
				if (flag == false)
					break;
				i = i + 2;
			}
			return flag;
		}

	}

	public static void main(String args[]) {
		System.out.println(isValid("("));
	}
}
