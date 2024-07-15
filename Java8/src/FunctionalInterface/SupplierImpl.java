package FunctionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;



public class SupplierImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());
		
		
	}

	

}
