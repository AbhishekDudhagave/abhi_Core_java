package demoJava8.streamFilter.demoFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DempFlatMap {
	public static void main(String[] args) {

		List <Integer> planNum=Arrays.asList(1,2,3,4,5,6);


		ArrayList<Integer>al=new ArrayList<>();
		al.add(15);
		al.add(25);
		al.add(35);
		al.add(45);

		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(16);
		al2.add(26);
		al2.add(36);
		al2.add(46);

		//OR
		List<Integer>al3=Arrays.asList(26,36,46,56);

		List<List<Integer>> finalList=Arrays.asList(al,al2,al3);

		System.out.println("before flatmap");
		System.out.println(finalList);

//		List<Integer> mergedList = finalList.stream()
//				.flatMap(x -> x.stream())
//				.collect(Collectors.toList());

//		adding 10 in all lists
		List<Integer> mergedList =finalList.stream()
				.flatMap(x -> x.stream().map(num -> num + 10))
				.collect(Collectors.toList());

		System.out.println("after flat map");
		System.out.println(mergedList);


	}

}
