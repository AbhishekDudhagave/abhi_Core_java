package DemoCollection.demoArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoList {
	static  void arrayListGeneric(){
		ArrayList<String > arr1=new ArrayList<>();
		arr1.add("Mango");
		arr1.add("Banana");
		arr1.add("Apple");

		System.out.println(arr1);
		System.out.println("-----------");
		Iterator<String>itr=arr1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	static void arrayListNonGeneric(){
		ArrayList<String > arr1=new ArrayList<>();
		arr1.add("Mango");
		arr1.add("Banana");
		arr1.add("Apple");

		ArrayList ar=new ArrayList();
		ar.add("Hello");
		ar.add(22);
		ar.add(99.99909);
		ar.add(true);
		ar.add(arr1);

		System.out.println(ar);
		System.out.println("-----------");
		Iterator itr=ar.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println(ar.get(3));
		System.out.println("=====");
		System.out.println(ar.remove(4));

		System.out.println("=====");
		System.out.println(ar);

		ar.add(888);
		//changing the element
		ar.set(1,"Dates");
		System.out.println(ar);

	}
	public static void main(String[] args) {

//arrayListGeneric();
	arrayListNonGeneric();
	}
}
