package DemoAbstraction;

public class CarBikeMainMethod {
    public static void main(String[] args) {
        MyVehicle mv=new MyBike();
        mv.start();
        mv.stop();

        System.out.println("--------------------");
        MyVehicle mv1=new MyCar();
//        MyVehicle mv1=new MyCar("bmw",12);
        mv1.start();
        mv1.stop();

    }
}
