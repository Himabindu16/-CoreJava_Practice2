import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class StreamApi7 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7, 6, 3, 1, 8, 9, 6, 5);

//		BinaryOperator<Integer>bi = new BinaryOperator<Integer>() 
//		{
//			@Override
//			public Integer apply(Integer s, Integer e) 
//			{
//				System.out.println(s);
//				return s+e;
//			}
//		};
//			
//		nums.stream()
//		.filter(n -> n%2==1)
//		.map(n -> n*2)
//		.reduce(0, bi);//only s values
		
		Function<Integer, Integer> func = new Function<Integer, Integer>(){
			@Override
			public Integer apply(Integer n) 
			{		
				System.out.println(n);
				return n*2;
			}
		};
		//Intermediate and termination 
//		nums.stream()
//			.filter(n -> n%2==1)
//			.map(func)
//			.reduce(0, (s, e) -> s+e);
		
		int result = nums.parallelStream()
				.filter(n -> n%2==1)
				.map(n -> n*2)
				.reduce(0, (s, e) -> s+e);				
		
		System.out.println(result);
	
	}

}
