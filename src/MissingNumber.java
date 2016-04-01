
public class MissingNumber {
	public int missingNumber(int[] nums) {
		int result = 0;
		if (nums[nums.length - 1] != nums.length - 1) {
			return nums[nums.length - 1];
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i)
				result = i;
		}
		return result;
	}
}
