public class ReverseBits {
	public static int reverseBits(int n) {
		char temp;
		String binary = Integer.toBinaryString(4);
		System.out.println(binary);
		int length = binary.length();
		if (length < 32) {
			for (int i = 0; i < 32 - length; i++) {
				binary = "0" + binary;
			}
			char[] number = binary.toCharArray();
			for (int i = 0; i < length; i++) {
				temp = number[length - i];
				number[length - i] = number[i];
				number[i] = temp;
			}
			String reverseBinary = "";
			for (int i = 0; i < length; i++) {
				reverseBinary = reverseBinary + number[i];
			}
			System.out.println(reverseBinary);
		}
		return Integer.parseInt(Integer.toBinaryString(n));
	}

	public static void main(String args[]) {
		System.out.println(reverseBits(43261596));
	}
}
