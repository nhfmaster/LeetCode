import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
	public static String convertToTitle(int n) {
		String result = "";
		String each_digit = "";
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		for (int i = 1; i <= 26; i++) {
			char s = (char) (i + 64);
			String letter = String.valueOf(s);
			hashmap.put(i, letter);
		}

		while (n > 0) {
			int digit = n % 26;
			if (digit == 0)
				digit = 26;
			each_digit = hashmap.get(digit);
			result = each_digit + result;
			n = (n - 1) / 26;
		}
		return result;
	}

	public static void main(String args[]) {
		System.out.println(convertToTitle(26 * 27 + 1));
	}
}