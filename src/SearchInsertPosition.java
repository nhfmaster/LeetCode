public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int length = nums.length;
		int flag = nums.length / 2;
		int num = nums[flag];
		if (target < num) {
			int[] half = new int[flag + 1];
			for (int i = 0; i <= flag; i++) {
				half[i] = nums[i];
			}
			return searchInsert(half, target);
		} else if (target > num) {
			int[] half = new int[flag + 1];
			for (int i = length; i >= flag; i--) {
				half[i] = nums[i];
			}
			return searchInsert(half, target);
		} else if (target == num)
			return flag;

	}

	public static void main(String args[]) {

	}
}