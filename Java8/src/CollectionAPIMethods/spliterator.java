package CollectionAPIMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class spliterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>names=new ArrayList<String>();
		names.add("Javascript");
		names.add("Angular");
		names.add("React");
		names.add("Vue");
		
		Spliterator<String> namesSpliterator=names.spliterator();
		namesSpliterator.forEachRemaining(System.out::println);
		
	
		names.removeIf(name -> name.equals("Vue"));
		System.out.println(names);
	}

}
