public class ZigZagConversion {
	public static String convert(String s, int numRows) {
		if (s == null || s.length() <= numRows || numRows <= 1)
			return s;
		StringBuffer sb = new StringBuffer();
		// the first row
		for (int i = 0; i < s.length(); i += (numRows - 1) * 2) {
			sb.append(s.charAt(i));
		}

		for (int i = 1; i < numRows - 1; i++) {
			for (int j = i; j < s.length(); j += (numRows - 1) * 2) {
				sb.append(s.charAt(j));
				if (j + (numRows - i - 1) * 2 < s.length()) {
					sb.append(s.charAt(j + (numRows - i - 1) * 2));
				}
			}
		}
		// the last row
		for (int i = numRows - 1; i < s.length(); i += (numRows - 1) * 2) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		String result = convert("PAYPALISHIRING", 3);
		System.out.println(result);
	}
}
