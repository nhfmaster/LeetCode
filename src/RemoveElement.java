import java.util.ArrayList;
import java.util.Collection;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		int result = 0;
		if (nums.length == 0) {
			result = 0;
		} else {
			if (nums.length != 1) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int i = 0; i < nums.length; i++) {
					list.add(nums[i]);
				}
				list.;
				result = list.size();
				System.out.println(result);
			} else if (val == nums[0]) {
				result = 0;
			} else if (val != nums[0])
				result = 1;

		}
		return result;
	}

	public static void main(String args[]) {
		int[] nums = { 3, 3, 3, 3, 3, 3, 3, 3, 3 };
		System.out.println(removeElement(nums, 3));
	}
}
