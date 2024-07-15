package Optional;
import java.util.Optional;
public class OptionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//isPresent Method
		
		
		String email=null;
		
		
		Optional<String>stringOptional=Optional.ofNullable(email);
		if(stringOptional.isPresent()) {
			
			System.out.println(stringOptional.get());
		}
		else {
			System.out.println("no value present");
		}
		
	//	-------------------------------------------------------------------------
		
		//orElse Method
		
		
		Optional<String>stringOptional1=Optional.ofNullable(email);
	String defaultOptional=stringOptional1.orElse("default@gmail.com");
	System.out.println(defaultOptional);
		
		
		
		//-------------------------------------------------------------------------
		
		//orElseGet() Method
		
		Optional<String>stringOptional2=Optional.ofNullable(email);
		String defaultOptional2=stringOptional2.orElseGet(() -> "default@gmail.com");
		System.out.println(defaultOptional2);
		
		//--------------------------------------------------------------------------
		
		//orElseThrow() Method
		
		Optional<String>stringOptional3=Optional.ofNullable(email);
		String optionalObject=stringOptional3.orElseThrow(()-> new IllegalArgumentException("Email does not exist"));
		System.out.println(optionalObject);
		
		
		
		//----------------------------------------------------------------------------
		
		//ifPresent() Method
		
		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyOptional=Optional.empty();
		
		
		gender.ifPresent((s) -> System.out.println("Value is Present"));
		emptyOptional.ifPresent((s) -> System.out.println("No value Present"));
		
		
		
		
	
		
		}
	
	
		
	}


