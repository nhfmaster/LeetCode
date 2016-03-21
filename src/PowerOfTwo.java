
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;
		int result = n;
		while (result != 1) {
			if (result % 2 != 0) {
				return false;
			} else {
				result = result / 2;
			}
		}
		return true;
	}
}
