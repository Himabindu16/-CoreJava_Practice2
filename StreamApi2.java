import java.util.*;
//import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi2 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7, 6, 3, 1, 8, 9, 6, 5);
//		int sum = 0;
//		for(int n : nums) 
//		{
//			if(n%2 == 1)
//			{
//				n = n*2;
//				sum = sum + n;
//			}
//		}
		Stream<Integer> stream = nums.stream();		
		
		//Consumer<Integer> consumer = (Integer i) -> System.out.println(i);
		//(or)
		//Consumer<Integer> consumer = i -> System.out.println(i);
		//(or)
		//Consumer<Integer> consumer = n -> System.out.println(n);
		//(or)
		stream.forEach( n -> System.out.println(n));
		
	}
}