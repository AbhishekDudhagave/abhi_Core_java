package DemoCollection.demoComparableComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentComparableMain {
	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		Student s1=new Student(1,"Abhishek");
		Student s2=new Student(0,"Harmesh");
		Student s3=new Student(2,"Lokesh");

		al.add(s1);
		al.add(s2);
		al.add(s3);

		Collections.sort(al);

		for (Object i:al){
			System.out.println(" "+i);
		}
	}
}
