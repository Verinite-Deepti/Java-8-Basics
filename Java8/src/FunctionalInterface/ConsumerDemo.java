package FunctionalInterface;
import java.util.function.Consumer;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consumer<String> consumer=(input) -> System.out.println(input);
		consumer.accept("Hello World");
		
		
	}

}
