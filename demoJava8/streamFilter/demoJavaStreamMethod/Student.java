package demoJava8.streamFilter.demoJavaStreamMethod;

public class Student {
	int stdId;
	String stdName;
	int stdScore;

	public Student(){

	}
	public Student(int stdId, String stdName, int stdScore) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdScore = stdScore;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdScore() {
		return stdScore;
	}

	public void setStdScore(int stdScore) {
		this.stdScore = stdScore;
	}

	@Override
	public String toString() {
		return "Student{" +
				"stdId=" + stdId +
				", stdName='" + stdName + '\'' +
				", stdScore=" + stdScore +
				'}';
	}
}
