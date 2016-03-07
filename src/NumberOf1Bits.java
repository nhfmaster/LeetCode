public class NumberOf1Bits {
	// you need to treat n as an unsigned value
	public static int hammingWeight(int n) {
		int num = 0;
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		for (int i = 0; i < binary.length(); i++) {
			char numBinary = binary.charAt(i);
			if (numBinary == '1') {
				num++;
			}
		}
		return num;
	}

	public static void main(String args[]) {
		String binary = Integer.toBinaryString(11);
		System.out.println(binary);
		System.out.println(hammingWeight(11));
	}
}