package demoJava8.streamFilter.demoMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoMap {
	static void withoutMap(){
		List<String> names= Arrays.asList("abhishek","lokesh","abhijeet","vivek");

		System.out.println("names in small letter");
		System.out.println(names);

		List<String> capitalNames=new ArrayList<>();
		for(String i:names){
			capitalNames.add(i.toUpperCase());
		}
		System.out.println("names in capital letter");
		System.out.println(capitalNames);
	}

	static void withMap() {
		List<String> names = Arrays.asList("abhishek", "lokesh", "abhijeet", "vivek");

		System.out.println("names in small letter");
		System.out.println(names);

		System.out.println("names in Capital letter");

//		names.stream()
//		.map(n->n.toUpperCase())
//		.forEach(str-> System.out.println(str));

		names.stream()
				.map(n->n.toUpperCase())
				.forEach(System.out::println);
	}
		public static void main(String[] args) {
//		    withoutMap();
			withMap();
	}
}
