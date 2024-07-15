package LambdaExpressions;

interface Add
{
	int addition(int a,int b);
}
public class Add2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Add addition=(a,b)->(a + b);
	int result=addition.addition(20, 30);
	System.out.println(result);
		
	
	}

}
