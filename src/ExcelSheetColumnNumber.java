import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int num = 0;
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		for (int i = 1; i <= 26; i++) {
			char alphabet = (char) (i + 64);
			String letter = String.valueOf(alphabet);
			hashmap.put(letter, i);
		}
		int length = s.length();

		return num;
	}
}