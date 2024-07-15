package Java8Assignments;


import java.util.Scanner;
import java.util.stream.IntStream;
public class ReversePyramidStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n=sc.nextInt();
		printreversestring(n);
		
		
	}

	private static void printreversestring(int n) {
		// TODO Auto-generated method stub
		IntStream.range(0, n).forEach(i -> {
            IntStream.range(0, i).forEach(space -> System.out.print(" "));
            IntStream.range(0, (n * 2 - 1) - (2 * i)).forEach(star -> System.out.print("*"));
            System.out.println();
        });
    }
		
	}


