
class Calc
{
	public int add(int ... nums)
	{
		int sum = 0;
		for(int i:nums) {
			sum=sum+i;
		}
		return sum;
	}
}

public class VarArgs1 {

	public static void main(String[] args) {
		Calc obj = new Calc();
	
		int result = obj.add(2,3,4,5);
		System.out.println(result);
	}

}
