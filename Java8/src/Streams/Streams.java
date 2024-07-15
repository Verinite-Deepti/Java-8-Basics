package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//create a stream
		Stream<String> stream=Stream.of("a","b","c");
		stream.forEach(System.out::println);
		
//create  a stream from sources
		
Collection<String> collection=Arrays.asList("JAVA","J2EE","Spring","Hibernate");
Stream<String> stream2=collection.stream();
stream2.forEach(System.out::println);

List<String> list=Arrays.asList("JSP","JAVA","SPRINGBOOT","MYSQL");
Stream<String> stream3=list.stream();
stream3.forEach(System.out::println);
		
Set<String> set=new HashSet<>(collection);
Stream<String>stream4=set.stream();
stream4.forEach(System.out::println);

String[] strArray= {"a","b","c"};
Stream<String>stream5=Arrays.stream(strArray);
stream5.forEach(System.out::println);
	}

}
