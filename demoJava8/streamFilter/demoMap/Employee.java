package demoJava8.streamFilter.demoMap;

public class Employee {
	Integer empId;
	String empName;
	Integer empSalary;

	public Employee(){

	}

	public Employee(Integer empId, String empName, Integer empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"empId=" + empId +
				", empName='" + empName + '\'' +
				", empSalary=" + empSalary +
				'}';
	}
}
