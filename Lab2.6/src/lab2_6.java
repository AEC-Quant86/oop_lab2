public class lab2_6 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] out = newArr(a, 3);
		
		for (int i : out) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int[] out1 = newArr(a, 10);
		
		for (int i : out1) {
			System.out.println(i);
		}
		

	} 
	
	static int[] newArr(int[] a, int n) {
		
		if (n > a.length) {
			int[] nw = a;
			return nw;
		}
		
		int[] nw = new int[n];
		
		for (int i = 0; i < nw.length; i++) {
			nw[i] = a[i];
		}
		
		return nw;
	}
}
