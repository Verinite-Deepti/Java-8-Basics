package Java8Assignments;

import java.util.Arrays;

public class firstlettereachwordstringusingregex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World from Java 8";

        Arrays.stream(input.split("\\s+"))
              .map(word -> word.substring(0, 1))
              .forEach(System.out::print);
    }
}
