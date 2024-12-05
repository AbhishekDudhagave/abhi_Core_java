package DemoExceptionHandling;

public class DemoClass {
    public static void main(String[] args) {
        try{
            int a=100/0;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Remaining code !");
        }
    }
}
