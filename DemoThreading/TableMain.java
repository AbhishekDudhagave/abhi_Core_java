package DemoThreading;

public class TableMain {
	public static void main(String[] args) {
		TableA tA=new TableA();
		Thread ta1=new Thread(tA);

		TableB tB=new TableB();
		Thread tb1=new Thread(tB);

		ta1.start();
//		ta1.stop();
		tb1.start();
//		tb1.stop();
	}
}
