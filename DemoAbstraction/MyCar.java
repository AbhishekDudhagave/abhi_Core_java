package DemoAbstraction;

public class MyCar extends MyVehicle{


    public MyCar() {

    }

//    MyCar(String brand, int maxSpeed) {
//        super(brand, maxSpeed);
//    }
//
//    public MyCar(String brand) {
//        super(brand);
//    }

    @Override
    public void start() {
        System.out.println("Car starts!!S");
    }
}
