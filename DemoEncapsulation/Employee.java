package DemoEncapsulation;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee (){

    }
    public Employee (String empName, int empAge, double empSalary){
        this.name=empName;
        this.age=empAge;
        this.salary=empSalary;
    }
    public void setName(String empName){
        this.name=empName;
    }
    public String getName(){
        return name;
    }

    public void setSalary(double empSal){

        if(empSal>20000){
            this.salary=empSal;
        }else {
            System.out.println("Salary should be greater than 20000");
        }

        this.salary=empSal;
    }
    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int empAge) {
        if(empAge>17){
            this.age = empAge;
        }else {
            System.out.println("Age should be greater than 17");
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
