package DemoCollection.demoComparableComparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DemoUserMain {
	public static void main(String[] args) {
		DemoUser du1=new DemoUser(18,"Abhishek");
		DemoUser du2=new DemoUser(22,"Lokesh");
		DemoUser du3=new DemoUser(18,"Abhijeet");

		ArrayList al=new ArrayList();
		al.add(du1);
		al.add(du2);
		al.add(du3);


		System.out.println("Before sort");
		for (Object i:al){
			System.out.println(i);
		}

		Collections.sort(al,new DemoUser());

		System.out.println("after sort");
		for (Object i:al){
			System.out.println(i);
		}


	}


}
