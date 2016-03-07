import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
	public static int singleNumber(int[] nums) {
		int n = 0;
		Map<Integer, ArrayList<Integer>> hashmap = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			if (hashmap.get(nums[i]) == null)
				hashmap.put(nums[i], new ArrayList<Integer>());
			else
				hashmap.get(nums[i]).add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			// System.out.println(hashmap.get(nums[i]).size());
			if (hashmap.get(nums[i]).size() == 0)
				n = nums[i];
		}
		return n;
	}

	public static void main(String args[]) {
		int[] nums = { 3, 3, 3, 6, 5, 7, 7, 7, 4, 5, 5, 6, 6 };
		System.out.println(singleNumber(nums));
	}
}
