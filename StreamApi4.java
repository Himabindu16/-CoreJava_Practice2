//import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//import java.util.function.IntFunction;
//import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi4 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7, 6, 3, 1, 8, 9, 6, 5);
		
//		Function<Integer, Integer>func = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer n) {
//				return n*2;
//			}
//		};

//		Function<Integer, Integer>func = (Integer n) -> n*2;

		Function<Integer, Integer>func = n -> n*2;
		//Function<Integer, Double>func = n -> n*2.5;			
		
		//Predicate<Integer> predicate = (Integer n) -> n%2==1;
				
		Stream<Integer> stream1 = nums.stream();		
		//Stream<Integer> stream2 = stream1.filter(predicate);	
		Stream<Integer> stream2 = stream1.filter(n -> n%2==1);
		Stream<Integer> stream3 = stream2.map(func);
		//Stream<Double> stream3 = stream2.map(func);
		
		stream3.forEach(n -> System.out.println(n));


	}

}
