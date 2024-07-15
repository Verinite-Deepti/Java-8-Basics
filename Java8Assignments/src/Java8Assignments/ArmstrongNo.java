package Java8Assignments;

import java.util.function.IntPredicate;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IntPredicate isArmstrong = n -> {
	            String s = Integer.toString(n);
	            int len = s.length();
	            int sum = s.chars()
	                       .map(c -> (int) Math.pow(c - '0', len))
	                       .sum();
	            return sum == n;
	        };
	        int number = 153; 
	        System.out.println(isArmstrong.test(number) ? "Armstrong" : "Not Armstrong");
	    }
	}