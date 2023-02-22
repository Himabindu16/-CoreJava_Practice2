
class Calculator {
	
	int a;
	int b;
	
	void add() {
		
		a=10;
		b=20; 
		int c=a+b;
		System.out.println(c);
	}
}


public class ReturnTypes1 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add();

	}

}

