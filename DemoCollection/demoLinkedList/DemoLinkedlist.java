package DemoCollection.demoLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedlist {
	static void genericType(){
		LinkedList <String>ll=new LinkedList<>();
		ll.add("Hello");
		ll.add("User");

		System.out.println(ll);
		System.out.println("-----------");

		for (String str :ll){
			System.out.println(str);

		}

		System.out.println("-----------");

		//.peak() only shows last elemt but doesnt removes it
		System.out.println(ll.peek());
		System.out.println(ll);

		System.out.println("=============");

		//.pop() remove last element completely
		System.out.println(ll.pop());
		System.out.println(ll);
	}
	static void nonGenericType(){

		ArrayList al=new ArrayList();
		al.add("Apple");
		al.add("Banana");
		al.add("Orange");
		al.add("Mango");

		List ll=new LinkedList();
		ll.add(false);
		ll.add("Hello");
		ll.add(88.99);
		ll.add('k');
		ll.add(al);

		for(Object i:ll){
			System.out.println(i);
		}
		System.out.println("-----------");

		Iterator itr=ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("============");



	}
	public static void main(String[] args) {
//	nonGenericType();
		genericType();
	}
}
