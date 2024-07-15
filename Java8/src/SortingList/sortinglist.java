package SortingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortinglist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> fruits=new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Cherry");
		
		
		List<String> veges=new ArrayList<String>();
		veges.add("Potato");
		veges.add("Tomato");
		veges.add("Onion");
		veges.add("Raddish");
		
		
		List<String> flowers=new ArrayList<String>();
		flowers.add("Rose");
		flowers.add("Lotus");
		flowers.add("Marigold");
		flowers.add("Jasmine");
		
		//SORTING IN ASCENDING ORDER
		
		List<String> sortedList=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<String> sortedList1=veges.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		List<String>sortedList2=flowers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);
		
		
		
		System.out.println("*************************************************");
		//SORTING IN DESCENDING ORDER
		
		
		List<String> sortedList3=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList3);
		
		List<String> sortedList4=veges.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(sortedList4);
		
		
	}

}
