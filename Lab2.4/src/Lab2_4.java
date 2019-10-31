
public class Lab2_4 {
	public static void main(String[] args) {
		System.out.println(factorial(6));
		System.out.println(factorialRec(6));

	} 
	
	static int factorial(int n) {
		int result = 1;
		
		for(int i = 0; i < n; i += 2 ) {
				result *= n - i;
		}
		
		return result;
	}
	
	static int factorialRec(int n) {
		 if (n == 0 || n == 1) return 1;
		 return n * factorialRec(n - 2);
	}
}
