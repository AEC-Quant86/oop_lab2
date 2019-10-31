
public class lab2_8 {

	public static void main(String[] args) {
		int[] t = {1, 12, 255, 134, 216}; 
		int out = mid(t);
		System.out.println(out);
		
	} 
	
	
	static int mid(int... args) {
		
		int mid = 0;
	
		for(int i = 0; i < args.length; i++)
			mid += args[i];
		
		return mid = mid /  args.length;
	}
	
}
