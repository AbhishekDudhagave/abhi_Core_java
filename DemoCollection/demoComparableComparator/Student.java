package DemoCollection.demoComparableComparator;

public class Student implements Comparable<Student> {
	int id;
	String name;
	public Student(){

	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	//	positive integer, if the current object is greater than the specified object.
//	negative integer, if the current object is less than the specified object.
//	zero, if the current object is equal to the specified object.
	@Override
	public int compareTo(Student std) {
		if(std.id>=1){
			System.out.println("Greater");
		} else if (std.id>=0) {
			System.out.println("not usefiel");
		}else {
			return 0;
		}
		return 0;
	}
}
