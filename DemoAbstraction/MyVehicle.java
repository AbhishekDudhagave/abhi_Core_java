package DemoAbstraction;

public abstract class MyVehicle {
//    int maxSpeed;           // Instance variable
//    static String type;     // Static variable
////    final String brand;     // Final variable
//
//    // Constructor to initialize variables
//    MyVehicle(String brand, int maxSpeed) {
////        this.brand = brand;
//        this.maxSpeed = maxSpeed;
//    }

    // Static block to initialize static variables
//    static {
//        type = "Transport";
//    }
    //abstract method
    public abstract void start();

    //non abstract method
    public void stop(){
        System.out.println("Vehicle Stops !");
    }
//    public MyVehicle (String brand){
//
//        this.brand = brand;
//    }
    public static void main(String[] args) {

          }
}
