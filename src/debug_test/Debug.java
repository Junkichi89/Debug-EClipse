package debug_test;

public class Debug {
	public static void main(String[] args) {
		int a = 1;
		int b = a  + 1;
		String  c = getName();
		String d = b + c;
		System.out.println(d);
	}
	
	private static String getName() {
		return "test";
	}

}
