public class GradeCalc {

	public static void main(String[] args) {
		
		int marks = 65;
		if (marks >= 90) {
			System.out.println("A");
		}
		else if(marks >= 75 && marks < 90) {
			System.out.println("B");
		}
		else if(marks >= 60 && marks < 75) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}


}
