package DemoCollection.demoArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndListConversion {

	static void arrayToList(){

		int[] arr1={22,1,45,89};

		System.out.println("before adding");

		List ll=new ArrayList();
		System.out.println(ll);

		for(Object i:arr1){
			ll.add(i);
		}

		System.out.println("after adding");
		System.out.println(ll);
	}

	static void listToArray(){
		LinkedList <String> ll=new LinkedList<>();
		ll.add("Apple");
		ll.add("Mango");
		ll.add("Banana");
		ll.add("Strawberry");
		System.out.println("before adding");
		System.out.println(ll);


		String[] fruits=ll.toArray(new String[ll.size()]);
		System.out.println("after adding");

		for (String i:fruits){
			System.out.println(i);
		}

	}
	public static void main(String[] args) {
//	arrayToList();
		listToArray();
	}
}
