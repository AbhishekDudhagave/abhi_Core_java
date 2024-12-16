package DemoCollection.demoArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayMain {
	public static void main(String[] args) {
		ArrayList<Student> as=new ArrayList<>();
		as.add(new Student("Abhishek",7));
		as.add(new Student("Lokesh",17));
		as.add(new Student("Vivek",23));

		Iterator itr=as.iterator();

		while (itr.hasNext()){
			Student std=(Student) itr.next();
			System.out.println(std.id+" "+std.name);
		}

		//OR
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
