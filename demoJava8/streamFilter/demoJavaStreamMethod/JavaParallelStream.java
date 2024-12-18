package demoJava8.streamFilter.demoJavaStreamMethod;

import java.util.Arrays;
import java.util.List;

public class JavaParallelStream {
	public static void main(String[] args) {
		List<Student> std= Arrays.asList(new Student(1,"Abhishek",72),
				new Student(1,"Vivek",99),
				new Student(1,"Bhau",69),
				new Student(1,"Shivam",60),
				new Student(1,"Abhijeet",75),
				new Student(1,"Lokesh",89)
		);
		//by stream()
		std.stream()
				.filter(x->x.stdScore>=85)
				.forEach(x-> System.out.println(x));

		System.out.println("-------------------------");

		// by parallelStream()
		std.parallelStream()
				.filter(x->x.getStdScore()>=85)
				.forEach(x-> System.out.println(x));

		System.out.println("-------------------------");

		// converting stream() into parallelStream()
		std.stream()
				.parallel()
				.filter(x->x.getStdScore()<=80)
				.forEach(x-> System.out.println(x));
	}
}
