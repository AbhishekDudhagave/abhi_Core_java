package DemoEncapsulation;

public class EmployeeRunMain {
    public static void main(String[] args) {
        Employee em=new Employee();
        em.setAge(29);
        em.setName("Abhishek");
        em.setSalary(77447.77d);
        System.out.println(em);
    }
}
