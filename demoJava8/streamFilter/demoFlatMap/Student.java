package demoJava8.streamFilter.demoFlatMap;

public class Student {
	Integer stdId;
	String stdName;
	String stdGrade;

	public Student(){

	}

	public Student(Integer stdId, String stdName, String stdGrade) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdGrade = stdGrade;
	}

	@Override
	public String toString() {
		return "Student{" +
				"stdId=" + stdId +
				", stdName='" + stdName + '\'' +
				", stdGrade='" + stdGrade + '\'' +
				'}';
	}
}
