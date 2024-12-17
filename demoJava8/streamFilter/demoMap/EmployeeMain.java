package demoJava8.streamFilter.demoMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> emp= new ArrayList<>();
		emp.add(new Employee(101,"Abhishek",70000));
		emp.add(new Employee(101,"Lokesh",85000));
		emp.add(new Employee(101,"Vivek",99000));
		emp.add(new Employee(101,"Shubham",68000));
		emp.add(new Employee(101,"Abhijeet",90000));

		// filter out employee having salary less than 80000 & increase salary with 20000

		List<Integer> newSalary = emp.stream()
				.filter(n -> n.empSalary <= 80000)
				.map(n -> n.empSalary + 20000)
				.collect(Collectors.toList());

		System.out.println(newSalary);

	}
}
