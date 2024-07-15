package Java8Assignments;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] array1= {1,2,3,4,5,6};
		Integer[] array2= {6,4,7,3,8,1};
		
		Set<Integer> set1=new HashSet<>(Arrays.asList(array1));
		Set<Integer> set2=new HashSet<>(Arrays.asList(array2));
		
		
		Set<Integer> commonElements=set1.stream().filter(set2::contains).collect(Collectors.toSet());
		
		System.out.println(commonElements);
	}

}
