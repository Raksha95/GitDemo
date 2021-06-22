import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStreams {

	public static void main(String[] args) {

	/*	List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		values.stream().distinct().forEach(s -> System.out.println(s));

		// ---> OUTPUT:- is {3,2,7,5,1,9} */

		List<Integer> li = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7); // ---> OUTPUT:- Sorted Order is
																	// {1,2,3,5,7,9} {1,2,3,5,7,9}
		li.stream().distinct().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));

		System.out.println(li.get(2));// ----> OUTPUT:-3 

	}

}
