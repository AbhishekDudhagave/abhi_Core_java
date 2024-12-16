package DemoCollection.demoComparableComparator;

import java.util.Comparator;

public class DemoUser implements Comparator<DemoUser> {
	int age;
	String name;
	public DemoUser(){

	}
	public DemoUser(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DemoUser{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public int compare(DemoUser d1, DemoUser d2) {
		if(d1.age> d2.age ){
			System.out.println("greater");
		}else if(d1.age< d2.age ){
			System.out.println("smaller");
		}else if(d1.age == d2.age ){
			System.out.println("same");
		}else {
			return 0;
		}
		return 0;
	}
}
