package DefaultandStaticInterface;



interface Vehicle{
	String getBrand();
	String speedUp();
	String slowDown();
	
	
	default String turnAlarmOn() {
		return "turning vehicle alarm on";
	}
	
	default String turnAlarmOff() {
		return "turning vehicle alarm off";
	}
}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "the car is speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "the car is slowing down";
	}
	
}



public class DefaultInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car vehicle=new Car();
System.out.println(vehicle.getBrand());
System.out.println(vehicle.speedUp());
System.out.println(vehicle.slowDown());



System.out.println(vehicle.turnAlarmOff());
System.out.println(vehicle.turnAlarmOn());

	}

}
