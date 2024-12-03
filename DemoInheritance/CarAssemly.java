package DemoInheritance;

public class CarAssemly {
    public static void main(String[] args) {
//        Car c=new Car();
//        Bus b=new Bus();
//        System.out.println("car name "+c.name);
//        System.out.println("car wheels "+c.wheels);
//        System.out.println("bus name "+b.name);
//        System.out.println("bus wheels "+b.wheels);
        Vehicle vehicle;
        vehicle=new Bus();
        vehicle.start();

        Vehicle v=new Bus();
        v.start();

//        vehicle=new Car();
//        vehicle.start();

    }
}
