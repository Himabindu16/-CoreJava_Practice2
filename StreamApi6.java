import java.util.Arrays;
import java.util.List;
//import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamApi6 {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7, 6, 3, 1, 8, 9, 6, 5);

//		BinaryOperator<Integer>bi = (Integer s, Integer e) -> {
//				System.out.println(s+" + "+e);
//				return s+e;
//		};
		
		//BinaryOperator<Integer>bi = (s, e) -> s+e;

		Stream<Integer> stream1 = nums.stream();	//got stream			
		Stream<Integer> stream2 = stream1.filter(n -> n%2==1);//odd no's filtering
		Stream<Integer> stream3 = stream2.map(n -> n*2);//changing values and got new stream
		int result = stream3.reduce(0, (s, e) -> s+e);
		
		System.out.println(result);
	
	}

}
