

public class lab2_3 {
public static void main(String[] args) {
	int[] t = {1, 12, 255, 134, 216};
	test.arguments(1, 2, 3, 10, 15);
	System.out.println();
	test.arguments(t);
} 
}

class test {
	
	public static void arguments(int... t) {
		System.out.println("Max: " + max(t));
		System.out.println("Mid: " + mid(t));
		System.out.println("Min: " + min(t));
	}
	
	static int mid(int... args) {
		
		int mid = 0;
	
		for(int i = 0; i < args.length; i++)
			mid += args[i];
		
		return mid = mid /  args.length;
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