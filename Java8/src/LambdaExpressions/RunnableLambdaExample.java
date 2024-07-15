package LambdaExpressions;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread threadLambda=new Thread(() -> System.out.println("Run method called using lambda...."));
		threadLambda.start();
	}

}
