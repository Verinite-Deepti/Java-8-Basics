package LambdaExpressions;


interface Shape{
	void draw();
}
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape rectangle=() -> System.out.println("Rectangle class:draw() method ");
rectangle.draw();

Shape Triangle=() -> System.out.println("Triangle class:draw() method ");
Triangle.draw();

Shape circle=() -> System.out.println("Circle class:draw() method ");
circle.draw();

Shape square=() -> System.out.println("Square class:draw() method ");
square.draw();
	}

}
