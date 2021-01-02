public class MethodEx {

//scope  opt return name  input 
  public static int sum(int [] arr) {
    int sum = 0;
    for(int i : arr){
    	sum = sum + i;
    }
   /* 
    for(int i = 0; i < arr.length(); i++){
      sum = sum + a[i];
    }
    */
//    System.out.println(sum);
    return sum;
  }

  public static void main(String[] args) {
    int [] arr1 = {1,2};
    System.out.println("sum = "+sum(arr1));
   
    int [] arr2 = {3,4};
    System.out.println(sum(arr2));
    
    int [] arr3 = {5,6,7};
    System.out.println(sum(arr3));
    
    int [] arr4 = {8,9};
    System.out.println(sum(arr4));
    
  }
}
