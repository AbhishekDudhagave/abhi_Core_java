package DemoAbstraction;

public interface Animal {

        // Abstract method
        void sound();

        // Default method
        default void sleep() {
            System.out.println("The animal is sleeping");
        }

}
