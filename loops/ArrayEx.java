public class ArrayEx {

	public static void main(String[] args) {
		int [] numbers = {1,3,100,5,8, 200, 300};
		
		String [] names = {"bharath","mandya"};
		
		System.out.println(names[0]);
		System.out.println(names[1]);		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int k = 0;
		while(k < numbers.length) {
			System.out.println(numbers[k]);
			k++;
		}		
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
