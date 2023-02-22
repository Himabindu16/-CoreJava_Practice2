import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi3 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7, 6, 3, 1, 8, 9, 6, 5);
		
		Predicate<Integer> predicate = new Predicate<Integer>()
		{
			@Override
			public boolean test(Integer n)
			{
//				if(n%2==1)
//					return true;
//				else
//					return false;
				return n%2==1;
			}
		};
				
		Stream<Integer> stream1 = nums.stream();		
		Stream<Integer> stream2 = stream1.filter(predicate);	
		
		
		stream2.forEach( n -> System.out.println(n));
	}

}
