package DemoAbstraction;

public class AnimalMain {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Calls Dog's sound method
        myDog.sleep();  // Calls the default sleep method

        Animal myCat = new Cat();
        myCat.sound();  // Calls Cat's sound method
        myCat.sleep();  // Calls the default sleep method

        Animal ann=new Dog();
        ann.sound();
        ann.sleep();
    }
}
