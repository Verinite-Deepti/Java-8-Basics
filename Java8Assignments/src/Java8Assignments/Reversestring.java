package Java8Assignments;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string to reverse:");
        String original = scanner.nextLine();
        String reversed = new StringBuilder(original)
                              .reverse()
                              .toString();

   
        System.out.println(reversed);
        
		
	}
}