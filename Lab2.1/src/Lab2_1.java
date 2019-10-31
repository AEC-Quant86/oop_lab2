
public class Lab2_1 {
public static void main(String[] args) {
	test t1 = new test();
	test t2 = new test();
	char[] test1CharArray = {'X'};
	char[] test2CharArray = {'T','e','s','t','2'};
	t1.setData('f');
	t1.setData("This is a first test string");
	t2.setData(test1CharArray);
	t2.setData(test2CharArray);
	t1.printData();
	t2.printData();
} 
}

class test {
	
	public char c;
	public String s;
	
	public void setData (char c) {
		char a[] = {c};
		setData(a);
	}
	
	public void setData (char[] c) {
		if (c.length == 1) 
			this.c = c[0];
		if (c.length > 1)
			s = String.valueOf(c);
	}
	
	public void setData (String s) {
		this.s = s;
	}
	
	public void printData () {
		System.out.println("char: " + c + " String: " + s);
	}
}