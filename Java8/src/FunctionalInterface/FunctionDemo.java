package FunctionalInterface;
import java.util.function.Function;
public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Function<String,Integer>function=(String s) -> s.length();
		System.out.println(function.apply("Rameshwaram"));
		
	}

}
