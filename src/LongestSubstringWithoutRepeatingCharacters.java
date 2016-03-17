import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		int max1 = 1;
		int max2 = 1;
		int temp = 0;
		int max = 0;
		if (s.equalsIgnoreCase("")) {
			return 0;
		} else {
			char[] charArr = s.toCharArray();
			Map<Integer, Character> hashMap = new HashMap<Integer, Character>();
			for (int i = 0; i < charArr.length; i++) {
				if (!hashMap.containsValue(charArr[i])) {
					hashMap.put(i, charArr[i]);
					max1 = hashMap.size();
				} else {
					max2 = hashMap.size();
					hashMap.clear();
					hashMap.put(i, charArr[i]);
				}
				max = max1 > max2 ? max1 : max2;
				if (temp < max) {
					temp = max;
				}
			}
			return temp;
		}
	}

	public static void main(String args[]) {
		System.out.println(lengthOfLongestSubstring(
				"xhsglmmhstrwgulfztwhhjlbihmviwehfwntibadvubdomiphgxpsiscsexccbjhazakadnvxqanelemtbdlmvoezl"));
	}
}