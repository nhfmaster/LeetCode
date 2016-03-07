public class CompareVersionNumbers {
	public static int compareVersion(String version1, String version2) {
		int n = 0;
		if (version1.contains(".") && version2.contains(".")) {
			int index1 = version1.indexOf(".");
			int index2 = version2.indexOf(".");
			int num1 = Integer.parseInt(version1.substring(0, index1));
			int digit1 = Integer.parseInt(version1.substring(index1 + 1,
					version1.length()));
			int num2 = Integer.parseInt(version2.substring(0, index2));
			int digit2 = Integer.parseInt(version2.substring(index2 + 1,
					version2.length()));
			if (num1 > num2) {
				n = 1;
			} else if (num1 < num2) {
				n = -1;
			} else if (num1 == num2) {
				if (digit1 > digit2) {
					n = 1;
				} else if (digit1 < digit2) {
					n = -1;
				} else if (digit1 == digit2) {
					n = 0;
				}
			}
		} else if (version1.contains(".")) {
			n = 1;
		} else if (version2.contains(".")) {
			n = -1;
		} else {
			if (Integer.parseInt(version1) > Integer.parseInt(version2))
				n = 1;
			if (Integer.parseInt(version1) < Integer.parseInt(version2))
				n = -1;
			if (version1 == version2)
				n = 0;
		}

		return n;
	}

	public static void main(String args[]) {
		System.out.println(compareVersion("2", "1"));
	}
}
