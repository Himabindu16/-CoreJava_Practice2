
class Calculate {
	
	void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

}

public class ReturnTypes2 {

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.sum(3, 2);
	}

}
