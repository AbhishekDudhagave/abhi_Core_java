package DemoStrings;

public class DemoWrapper {
    public static void main(String[] args) {
        //Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly
        Integer j=a;

        int aa=66;
        Integer ii=Integer.valueOf(aa);
        Integer jj=aa;

        System.out.println(aa);
        System.out.println(jj);
    }
}
