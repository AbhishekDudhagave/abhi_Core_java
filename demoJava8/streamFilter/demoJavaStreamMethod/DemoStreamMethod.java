package demoJava8.streamFilter.demoJavaStreamMethod;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreamMethod {
	static void basicMethods(){
		List<String> vehicles= Arrays.asList("car","car","bus","bike","bus","tractor");

		// count
		long countOfDictinct = vehicles.stream().distinct().count();
		System.out.println(countOfDictinct);

		//distinct
		List<String> finalList = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println(finalList);

		//limit
		vehicles.stream().limit(3).forEach(x-> System.out.println(x));
	}

	static void basicMethods2(){
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9);

		Optional<Integer> minValue = num.stream()
				.min((n1, n2) -> {
					return n1.compareTo(n2);
				});
		System.out.println(minValue);

		List<Integer> num2=Arrays.asList(1,2,3,4,5,6,7,8,9);

		System.out.println("--------------------------------");

//		Integer maxNum = num2.stream()
//				.max((n1, n2) -> {
//					return n1.compareTo(n2);
//				}).get();  // adding .get() will remove optional class as .get() method comes from Optional class itself

		Optional<Integer> maxNum = num2.stream()
				.max((n1, n2) -> {
					return n1.compareTo(n2);
				});
		System.out.println(maxNum);
	}
	static void reduceMethod(){
		List <Object>mixedList=Arrays.asList("1","2","3","A","B","C");

//		Optional reduced=mixedList.stream()
//				.reduce((value,combinedValue)->{return value+combinedValue};);
	}
	static void streamToArray(){
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9);

		Object[] arr1 =num.stream().toArray();

		for (Object i:arr1){
			System.out.println(i);
		}
	}
	static void basicNewMethod3(){
		List <Integer> numList=Arrays.asList(1,2,3,6,4,8,3,2);
		List<Integer> areeangedNumList = numList.stream().sorted().collect(Collectors.toList());

		System.out.println(areeangedNumList);
		System.out.println("---------------------");

		List <Integer> numList1=Arrays.asList(1,2,3,6,4,8,3,2);
		numList1.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(x->System.out.println(x));

		List<String> strList=Arrays.asList("Hello","World","New","Year");
		strList.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(x->System.out.println(x));
	}
	static void anyMatchStream(){
		Set<String> str=new HashSet<>();
		str.add("hello user");
		str.add("hello world");
		str.add("new user");
		str.add("old user");

		boolean value = str.stream()
				.anyMatch(x -> {
					return x.startsWith("hello");
				});
		System.out.println(value);
		System.out.println("---------------");

		boolean value2 = str.stream().allMatch(x -> {
			return x.startsWith("hello");
		});

		System.out.println(value2);

		boolean value3 = str.stream().noneMatch(x -> {
			return x.startsWith("H");
		});
		System.out.println(value3);
	}
	static void findanyStream(){
		List<String> name= Arrays.asList("hello","ram","shyam");
//		String any = name.stream().findAny().get();
//		System.out.println(any);
		String firstStr = name.stream().findFirst().get();
		System.out.println(firstStr);
		List<String> surname= Arrays.asList("world","sundar","prasad");

		Stream<String> stream1 = name.stream();
		Stream<String> stream2 = surname.stream();
		List<String>finalList= Stream.concat(stream1,stream2).collect(Collectors.toList());
		System.out.println(finalList);
	}
	public static void main(String[] args) {
//		basicMethods2();
//		streamToArray();
//		basicNewMethod3();
//		anyMatchStream();
		findanyStream();
	}
}
