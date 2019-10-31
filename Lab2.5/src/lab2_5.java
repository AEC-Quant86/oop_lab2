public class lab2_5 {
	public static void main(String[] args) {
		System.out.println(sqrSumm(5));
		System.out.println(sqrSummRec(4));

	} 
	
	static int sqrSumm(int n) {
		int result = 0;
		
		for(int i = 0; i < n; i ++ ) {
				result += (n - i) * (n - i);
		}
		
		return result;
	}
	
	static int sqrSummRec(int n) {
		 if (n == 0 || n == 1) return 1;
		 return n *n + sqrSummRec(n - 1);
	}
}
