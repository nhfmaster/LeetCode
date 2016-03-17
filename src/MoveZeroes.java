
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int numOfNoneZeroes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[numOfNoneZeroes] = nums[i];
				numOfNoneZeroes++;
			}
		}
		for (int i = numOfNoneZeroes; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
