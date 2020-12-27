public class OddEven {

	public static void main(String[] args) {
		int num = 3; // 3 % 2 -> 1 4 % 2 -> 0
		int rem = num % 2;

		if (rem == 0) { // + - * / ++ -- ==
			System.out.format("%d is Even", num);
		} else {
			System.out.format("%d is Odd", num);
		}
	}

}
