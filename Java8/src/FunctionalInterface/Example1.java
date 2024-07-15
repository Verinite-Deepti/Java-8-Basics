package FunctionalInterface;


@FunctionalInterface
public interface Example1 {
void print(String msg);
	


	default void d1() {
		
		System.out.println("default method d1");
	}
	
	default void d2() {
		
		System.out.println("default method d2");
	}
	
	static void s1() {
		System.out.println("Static method s1");
	}
	
	static void s2() {
		System.out.println("Static method s2");
	}
}
