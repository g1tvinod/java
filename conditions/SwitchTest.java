public class SwitchTest {

	public static void main(String[] args) {
		int dayOfWeek = 1;

		switch (dayOfWeek) {
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tuesday");
				break;
			case 3:
				System.out.println("wed");
				break;
			case 4:
				System.out.println("thurs");
				break;
			case 5:
				System.out.println("fri");
				break;
			default:
				System.out.println("weekend");
		}
		
		System.out.println("Hello");
	}
}
