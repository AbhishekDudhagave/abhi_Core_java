package demoJava8;

import java.util.Scanner;

public class DemoAreaImpl {
	public static void main(String[] args) {
		DemoArea a = (int num) ->{
				double ans=3.14*(num*num);
				System.out.println(ans);
			};



		//without lambda function
//		DemoArea a = new DemoArea() {
//			@Override
//			public void area(int num) {
//				double ans=3.14*(num*num);
//				System.out.println(ans);
//			}
//		};
		a.area(77);
	}
}
