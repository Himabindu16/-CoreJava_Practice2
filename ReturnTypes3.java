
class Calculator
{
	int add(int a, int b) {
		
		int c = a+b;
		return c;
	}
}
public class ReturnTypes3 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int result = cal.add(10, 20);
		System.out.println(result);
	}

}
