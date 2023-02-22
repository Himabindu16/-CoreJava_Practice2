 
class Plane {
	
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	
	public void takeOff()
	{
		System.out.println("Plane is taking Off");
	}
}

class CargoPlane extends Plane 
{
	public void fly()
	{
		System.out.println("Cargo Plane flies at lower height");
	}
	
	public void carryGoods()
	{
		System.out.println("Cargo plane is carrying Goods");
	}
}


class PassengerPlane extends Plane {

	public void fly()
	{
		System.out.println("Passenger Plane flies at medium height");
	}
	
	public void carryPassenger()
	{
		System.out.println("Passenger Plane carries Passenger");
	}
}

public class UnifiedModellingLanguage {

	public static void main(String[] args) 
	{
		//CargoPlane cp = new CargoPlane();
		Plane cp = new CargoPlane();		//Upcasting
		cp.fly();			//overridden
		cp.takeOff();		//inherited
		//cp.carryGoods();	//specialized
		((CargoPlane) cp).carryGoods();		//Downcasting
		
		
		//PassengerPlane pp = new PassengerPlane();
		Plane pp = new PassengerPlane();
		pp.fly();			//overridden
		pp.takeOff();		//inherited
		//pp.carryPassenger();//Specialized
		//((PassengerPlane)pp).carryPassenger();
		
	}
	
}
