public class lab2_7 {
	public static void main(String[] args) {

		char[] in = {'A', 'B', 'C', 'D', 'E'};
		System.out.println(in);
		
		int[] out = newArr(in);
		
		for (int x : out)
			System.out.println(x);
		
	} 
	
	static int[] newArr(char[] a ) {
		
		int[] out = new int[a.length];
		
		for (int i = 0; i < a.length; i++)
			out[i] = (int) a[i];
		return out;
	}
}
