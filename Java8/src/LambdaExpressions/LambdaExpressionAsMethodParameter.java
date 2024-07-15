package LambdaExpressions;


interface Shape1{
void draw();
}


public class LambdaExpressionAsMethodParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape1 rectangle=() -> System.out.println("Rectangle class: draw() method");
		
		Shape1 triangle=() -> System.out.println("Triangle class: draw() method");
		
		Shape1 circle=() -> System.out.println("Circle class: draw() method");
		
		Shape1 square=() -> System.out.println("Square class:draw() method");
		
		
		
		print(rectangle);
		print(square);
		print(circle);
		print(triangle);
	}

	
	public static void print(Shape1 shape1)
	{
		shape1.draw();
	}
	
	
}
