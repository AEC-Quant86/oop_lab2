
public class lab2_10 {
	public static void main(String[] args) {
		int[] t = {1, 12, 255, 134, 216};
		int [] out = doit(t);
		
		for (int x : t)
			System.out.print(x + " ");
		
		System.out.println();
		
		for (int x : out)
			System.out.print(x + " ");

	} 
	
	static int[] doit(int... args) {
		int[] out = new int[2];
		out[0] = max(args);
		out[1] = min(args);
		return out;
	}
	
	static int max(int... args) {
		int max = args[0];
		
		for(int i = 0; i < args.length; i++)
			max = args[i] > max ? args[i] : max;
		
		return max;
	}
	
	static int min(int... args) {
		int min = args[0];
		
		for(int i = 0; i < args.length; i++)
			min = args[i] < min ? args[i] : min;
		
		return min;
	}
	
}
