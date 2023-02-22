
class Demo
{
	public static void disp1()
	{
		System.out.println("Static method");
	}
	
	public void disp2()
	{
		System.out.println("Non Static method");
	}
	
}
public class Static4 {
  
	public static void main(String[] args) {
		Demo.disp1();
		Demo d= new Demo();
		d.disp2();
		//d.disp1();
	}
	
}
