public class DemoClass {
    int a;  // Initializing variable
    int b=66;//Declaring variable

    //Constructor

    //paramertrized Constructor
    public DemoClass(){

    }
    public DemoClass(int num){
        this.a=num;
    }

    public static void main(String[] args) {
        DemoClass dc=new DemoClass();
        DemoClass dc1=new DemoClass(55);

        System.out.println(dc1);
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
