package Optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email="deepti@gmail.com";
		String password="deepti@12345";
		
		//of,empty,ofNullable
		
		
		Optional<Object>emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		
		Optional<String>emailOptional=Optional.of(email);
		System.out.println(emailOptional.get());
		
        Optional<String>passwordOptional=Optional.of(password);
		System.out.println(passwordOptional.get());
		
		Optional<String> emailOptional1= Optional.ofNullable(email);
		System.out.println(emailOptional1.get());
		
		Optional<String> passwordOptional1=Optional.ofNullable(password);
		System.out.println(passwordOptional1.get());
	}

}
