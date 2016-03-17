import java.util.HashMap;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int sLength = s.length();
		int tLength = t.length();
		int sTemp = 0;
		if (sLength != tLength)
			return false;
		for (int i = 0; i < sLength; i++) {
			if (hashMap.get(s.charAt(i)) == null)
				hashMap.put(s.charAt(i), 1);
			else
				hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
		}
		for (int i = 0; i < tLength; i++) {
			if (!hashMap.containsKey(t.charAt(i)))
				return false;
			else
				hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
		}
		for (int i = 0; i < sLength; i++) {
			if (hashMap.get(s.charAt(i)) == 0)
				sTemp++;
		}
		if (sTemp == sLength)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		System.out.println(isAnagram("ab", "ba"));
	}
}
