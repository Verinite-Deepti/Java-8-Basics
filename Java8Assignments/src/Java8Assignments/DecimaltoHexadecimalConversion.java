package Java8Assignments;

import java.util.Scanner;
import java.util.function.Function;

public class DecimaltoHexadecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
	
		
		Function<Integer,String>decimalToHexadecimal=decimal->Integer.toHexString(decimal).toUpperCase();
		
		
		
		System.out.println(decimalToHexadecimal.apply(input1));
		System.out.println(decimalToHexadecimal.apply(input2));


	
	}

}