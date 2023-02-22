
class Parent
{
	void show()
	{
		System.out.println("Parent");
	}
}

class Child extends Parent
{
	@Override
	void show()
	{
		System.out.println("Child");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.show();	//Parent
		
		Child c =new Child();
		c.show();	//Child
		
		//Parent p= new Child();
		//p.show();		//Child 
	
	}

}
