import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int num = 0;
		int length = nums.length;
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < length; i++) {
			if ((hashmap.get(nums[i])) == null) {
				hashmap.put(nums[i], nums[i]);
			} else
				hashmap.remove(nums[i]);
		}
		return hashmap.values().iterator().next();
	}

	public static void main(String args[]) {
		int[] nums = { 1, 1, 3, 4, 5, 4, 3, 6, 6, 7, 7, 5, 9 };
		System.out.println(singleNumber(nums));
	}
}