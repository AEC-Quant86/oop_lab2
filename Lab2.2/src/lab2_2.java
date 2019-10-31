
public class lab2_2 {
public static void main(String[] args) {

	for (int i = 0; i < 9; i++)
		test.iteration();
} 
}

class test {
	
	static private int i = 0;
	
	static public void iteration() {
		System.out.println(i++);
	}
	
}