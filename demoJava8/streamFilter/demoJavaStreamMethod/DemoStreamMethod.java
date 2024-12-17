package demoJava8.streamFilter.demoJavaStreamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	public static void main(String[] args) {
//		basicMethods2();
		streamToArray();
	}
}
