package LambdaExpressions;


interface Shape2{
	void draw();
}

public class LambdaExpressionToImplementFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape2 rectangle=()-> System.out.println("Rectangle class :draw method");
		rectangle.draw();
		
		
	}

}
