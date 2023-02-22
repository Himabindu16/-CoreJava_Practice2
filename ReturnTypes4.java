
class Calculator {
	int add(int a, int b) {
		int c = a+b;
		return c;
	}
	int sub (int a, int b) {
		int c = a-b;
		return c;
	}
}
public class ReturnTypes4 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int addresult = cal.add(10, 20);
		int subresult = cal.sub(20, 10);
		System.out.println(addresult);
		System.out.println(subresult);
		
	}

}
