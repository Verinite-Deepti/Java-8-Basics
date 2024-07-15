package Java8Assignments;

import java.util.Scanner;
import java.util.stream.IntStream;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        printRightTriangle(n);
    }
    
    
    private static void printRightTriangle(int n) {
        IntStream.range(1, n + 1) .forEach(i -> { IntStream.range(0, i) .forEach(j -> System.out.print("* "));
                     System.out.println(); 
                 });
    }
}
