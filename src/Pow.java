public class Pow {
	public double myPow(double x, int n) {
		double result = 1;
		for (int i = 0; i < n; i++) {
			result = result * x;
		}
		return result;
	}
}
