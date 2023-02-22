
public class Static2 {

	//static variable
	static int a, b, c;
	
	//static block
	static
	{
		System.out.println("Static block");
		a=10;
		b=20;
		c=30;
	}
	
	//static method
	static void disp1()
	{
		System.out.println("Static method disp1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}	
	
		//non static variable
		int m, n, o;
	
		//non static block
		{
			System.out.println("Non Static block");
			m=100;
			n=200;
			o=300;
			a=40;
			b=50;
			c=60;
		}
		
		//non static method
		void disp2()
		{
			System.out.println("Non Static method disp2");
			System.out.println(m);
			System.out.println(n);
			System.out.println(o);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
			

			
	public static void main(String[] args) {
		
		System.out.println("Main method");
		disp1();
		Static2 s1 = new Static2();
		s1.disp2();
	}



}
