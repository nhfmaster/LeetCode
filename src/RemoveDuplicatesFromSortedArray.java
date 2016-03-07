public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
		int result = 0;
		int length = nums.length;
		if (length != 0) {
			if (length == 1) {
				result = 1;
			} else {
				for (int i = 0; i < length - 1; i++) {
					if (nums[i] == nums[i + 1]) {
						result = i + 1;
					}
				}
			}
		} else
			result = 0;
		return result;
	}

	public static void main(String args[]) {
		int nums[] = { 1, 2 };
		System.out.println(removeDuplicates(nums));
	}
}
