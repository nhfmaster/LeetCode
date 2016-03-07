import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hashmap.get(nums[i]) == null) {
				hashmap.put(nums[i], nums[i]);
			} else
				return false;
		}
		return true;
	}
}