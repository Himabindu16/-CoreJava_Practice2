import java.util.Scanner;

class Farmer
{
	private float pa;
	private float td;
	private static float ri;
	private float si;
	
	static 
	{
		ri=2.5f;
	}
	
	public void acceptInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Dear, kindly enter loan amount needed");
		pa=s.nextFloat();
		System.out.println("Dear, kindly enter time needed to repay");
		td=s.nextFloat();

	}
	
	public void compute()
	{
		si=(pa*td*ri)/100;
	}
	
	public void disp()
	{
		System.out.println("Si is:" +si);
	}
	
}

public class Static3 
{
	
	public static void main(String[] args) 
	{
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		
		f1.acceptInput();
		f1.compute();
		f1.disp();
		
		f2.acceptInput();
		f2.compute();
		f2.disp();
		
	}

}
