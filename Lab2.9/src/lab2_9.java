
public class lab2_9 {

	public static void main(String[] args) {
      
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int x : array)
			System.out.print(x + " ");
		
		System.out.println();
		
		array = reverse(array);
		
		for (int x : array)
			System.out.print(x + " ");
	} 
	
	  static int[] reverse(int[] arr) {
	        for (int i = 0; i < arr.length>>1; i++) {
	            // Меняет два элемента местами:
	            arr[arr.length-1-i] ^= arr[i] ^= arr[arr.length-1-i];
	            arr[i] ^= arr[arr.length-1-i];
	        }
	        return arr; //да да, не сам придумал, вот ссылка https://gist.github.com/SunDrop/9288942
	    }
}
