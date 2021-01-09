public class MethodsEx {
	
	static boolean isEligibleForVoting(int age){
		if(age < 18) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int a = 25;
		System.out.println(isEligibleForVoting(a));
		
		a = 15;
		System.out.println(isEligibleForVoting(a));
		
		a = 125;
		System.out.println(isEligibleForVoting(a));
	}

}
