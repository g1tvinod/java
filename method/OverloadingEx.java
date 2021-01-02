public class OverloadingEx {

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		return sum;
	}

	// [1,2,3,4,5,6,7,8,9,10], 5
	public static int sum(int[] arr, int n) {
		int sum = 0;
		if(n > arr.length) {
			return sum(arr);
		}
		else {
			for (int i = 0; i < n; i++) { 
				sum = sum + arr[i]; 
			} 
			return sum;
		}
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2 };
		System.out.println("sum = " + sum(arr1));

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(sum(arr2, 2));

		int[] arr3 = { 5, 6, 7 };
		System.out.println(sum(arr3, 100));

		int[] arr4 = { 8, 9 };
		System.out.println(sum(arr4));
		
		System.out.println(sum(1,2,3));
	}
}
