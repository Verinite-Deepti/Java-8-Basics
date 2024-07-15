package DefaultandStaticInterface;


interface Vehicle1{
	
	String getBrand();
	
	static String getCompany() {
		return "BMW";
		
	}
	
}


public class StaticInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Vehicle1.getCompany());
	}

}
