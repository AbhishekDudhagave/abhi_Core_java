package demoJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilter {

	static  void withoutStreamFilter(){
//		ArrayList<Integer> numList=new ArrayList<Integer>();
//		numList.add(5);
//		numList.add(10);
//		numList.add(15);
//		numList.add(20);
//		numList.add(25);
// above given Arraylist can also be written as

		List<Integer> numList= Arrays.asList(5,10,15,20,25);

		System.out.println("Old List");
		System.out.println(numList);

		List<Integer> evenNum=new ArrayList<>();
		for(Integer n:numList){
			if(n%2==0){
				evenNum.add(n);
			}

		}

		System.out.println("even List");
		System.out.println(evenNum);

	}

	static  void withStreamFilter() {
	//		ArrayList<Integer> numList=new ArrayList<Integer>();
	//		numList.add(5);
	//		numList.add(10);
	//		numList.add(15);
	//		numList.add(20);
	//		numList.add(25);
	// above given Arraylist can also be written as

		List<Integer> numList=Arrays.asList(5,10,15,20,25);

		System.out.println("Old List");
		System.out.println(numList);

//		ArrayList<Integer>evenNumList=new ArrayList<Integer>();

//		List<Integer> evenNumList = numList.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
//
//		System.out.println("After using Filter from stream (Java 8)");
//		System.out.println(evenNumList);
		numList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
		System.out.println("-----------------");
		//also above method can be written as
		numList.stream().filter(n->n%2==0).forEach(System.out::println);

	}

	static  void withStreamFilter1() {
		List<String> names=Arrays.asList("Abhishek","Lokesh","Abhijeet","Vivek","Shubham");

//		names.stream().filter(str->str.length()>5 && str.length()<8).collect(Collectors.toList());
//		names.stream().filter(str->str.length()>5 && str.length()<8).forEach(n-> System.out.println(n));
		names.stream().filter(str->str.length()>5 && str.length()<8).forEach(System.out::println);

	}
	public static void main(String[] args) {
//	withoutStreamFilter();
//	withStreamFilter();
	withStreamFilter1();
	}

}
