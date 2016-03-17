import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public static List<String> summaryRanges(int[] nums) {
		int s = 0, e = 0;
		List<String> list = new ArrayList<String>();
		if (nums == null || nums.length < 1)
			return list;
		while (e < nums.length) {
			if (e + 1 < nums.length && nums[e + 1] == nums[e] + 1) {
				e++;
			} else {
				if (s == e) {
					list.add(Integer.toString(nums[s]));
				} else {
					String str = nums[s] + "->" + nums[e];
					list.add(str);
				}
				++e;
				s = e;
			}
		}
		return list;
	}

	public static void main(String args[]) {
		int nums[] = { 0, 1, 2, 4, 5, 7, 8 };
		for (String s : summaryRanges(nums)) {
			System.out.println(s);
		}
	}
}
