import java.lang.reflect.Array;

public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
		int result = 0;
		int length = nums.length;
		int flag = length / 2;
		if (nums[flag] < nums[flag - 1] && nums[flag] < nums[flag + 1]) {
			result = nums[flag];
			return result;
		} else if (nums[flag] > nums[flag - 1]) {
			int half[] = new int[flag];
			for (int i = 0; i < flag; i++) {
				half[i] = nums[i];
			}
			findMin(half);
		} else if (nums[flag] > nums[flag - 1]) {
			int half[] = new int[flag];
			for (int i = length; i > flag; i--) {
				half[i] = nums[i];
			}
			findMin(half);
		}
	}

}
