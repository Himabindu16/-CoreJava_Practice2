import java.util.Scanner;

class Rectangle
{
	float len;
	float brd;
	float area;
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the length of the rectangle");
		len = s.nextFloat();
		System.out.println("Please enter the breadth of the rectangle");
		brd = s.nextFloat();
	}
	
	void compute()
	{
		area = len * brd;
	}
	
	void disp()
	{
		System.out.println("Area of rectangle is:"+area);
	}
}

class Square
{
	float len;
	float area;
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the length of the square");
		len = s.nextFloat();
	}
	
	void compute()
	{
		area = len * len;
	}
	
	void disp()
	{
		System.out.println("Area of square is:"+area);
	}
}

class Circle
{
	float pi;
	float rad;
	float area;
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the pi of the circle");
		pi = s.nextFloat();
		System.out.println("Please enter the radius of the rectangle");
		rad = s.nextFloat();
	}
	
	void compute()
	{
		area = pi * rad * rad;
	} 
	
	void disp()
	{
		System.out.println("Area of circle is:"+area);
	}
}

public class ProjectWithoutOOPs 
{

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		r.input();
		r.compute();
		r.disp();
		
		Square s = new Square();
		s.input();
		s.compute();
		s.disp();
		
		Circle c = new Circle();
		c.input();
		c.compute();
		c.disp();

	}

}
