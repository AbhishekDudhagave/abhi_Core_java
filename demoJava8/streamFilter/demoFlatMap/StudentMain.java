package demoJava8.streamFilter.demoFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> std1=new ArrayList<>();
		std1.add(new Student(101,"Abhishek","A"));
		std1.add(new Student(104,"Lokesh","C"));
		std1.add(new Student(103,"Vivek","B"));

		List<Student> std2=new ArrayList<>();
		std2.add(new Student(103,"Abhijeet","A"));
		std2.add(new Student(109,"Harmesg","D"));
		std2.add(new Student(120,"Bhau","C"));

		List<List<Student>> mergedStdList=new ArrayList<>();
		mergedStdList.add(std1);
		mergedStdList.add(std2);

		System.out.println("Before Java 8");
		for (List<Student> std:mergedStdList){
			for(Student i:std){
				System.out.println(i);
			}
		}
		System.out.println("After Java 8");
		List<Student> afterFlatMap = mergedStdList.stream()
				.flatMap(x -> x.stream()).collect(Collectors.toList());
//			.forEach(str->System.out.println(str));
		System.out.println(afterFlatMap);
	}
}
