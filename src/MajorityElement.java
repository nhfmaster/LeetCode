import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
		int n = 0;
		Map<Integer, ArrayList<Integer>> hashmap = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			if (hashmap.get(nums[i]) == null) {
				hashmap.put(nums[i], new ArrayList<Integer>());
			}
			hashmap.get(nums[i]).add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(hashmap.get(nums[i]).size());
			if (hashmap.get(nums[i]).size() > nums.length / 2)
				n = nums[i];
		}
		return n;
	}

	public static void main(String args[]) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
		System.out.println(majorityElement(nums));
	}
}
