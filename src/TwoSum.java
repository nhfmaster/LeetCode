import java.util.Hashtable;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!hashTable.containsKey(nums[i])) {
				hashTable.put(target - nums[i], i);
			} else {
				int k = hashTable.get(nums[i]);
				if (i != k) {
					return new int[] { k + 1, i + 1 };	
				}
			}
		}
		return null;
	}

	public static void main(String args[]) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] index = twoSum(numbers, target);
		for (int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}