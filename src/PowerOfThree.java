
public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		double result = Math.log(n) / Math.log(3);
		return Math.abs(result - Math.rint(result)) < 0.000000000001;
	}
}
