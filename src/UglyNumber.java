
public class UglyNumber {
	public boolean isUgly(int num) {
		if (num == 1)
			return true;
		if (num % 2 == 0) {
			if (num / 2 != 2 && num / 2 != 3 && num / 2 != 5)
				return false;
			else
				return true;
		}
		if (num % 3 == 0) {
			if (num / 3 != 2 && num / 3 != 3 && num / 3 != 5)
				return false;
			else
				return true;
		}
		if (num % 5 == 0) {
			if (num / 5 != 2 && num / 5 != 3 && num / 5 != 5)
				return false;
			else
				return true;
		}
		if (num / 1 == 2 || num / 1 == 3 || num / 1 == 5)
			return true;
		else
			return false;
	}
}
