package DemoStrings;

import java.util.logging.Logger;

public class MyString {

    String name="Abhishek"; // string literal
    String name1=new String("Tony");
String name2=name.concat(name1);
    public static void main(String[] args) {
        MyString ms=new MyString();
        System.out.println(ms.name);

        System.out.println(ms.name1);
        System.out.println(ms.name2);
        System.out.println(ms.name2);
//        Logger ll=Logger.getLogger("LL");
//        if(1>0){
//            System.out.println("Greater");
//            ll.info("succefully got Positive value");
//        }else {
//            System.out.println("Smaller");
//            ll.info("Value is not positive");
//        }
        //String buffer-- mutable & thread safe
        StringBuffer sb=new StringBuffer("Avengers");

        //Stringbuilder - mutable & non-thread safe
    StringBuilder sbu=new StringBuilder("Marvels");

    }
}
