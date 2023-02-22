
class Alien
{
	int age;
	String name;
	
	static int count;
	
	{
		count++;
	}
	
	Alien()
	{
		
	}
	
	Alien(int age)
	{
		this.age=age;
	}
	
	Alien(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
}


public class Static5 {

	public static void main(String[] args) {
		
		Alien a1 = new Alien();
		Alien a2 = new Alien(20);
		Alien a3 = new Alien(30, "Hello");
		
		System.out.println(Alien.count);
	}

}
