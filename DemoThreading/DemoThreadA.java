package DemoThreading;

public class DemoThreadA extends Thread {
	public void patterns(){
		for(int i=1;i<4;i++){
			System.out.println(" * ");
		}
	}
	public void run(){
		System.out.println("Run method started !!");
		patterns();
	}

	public static void main(String[] args) {
		DemoThreadA da=new DemoThreadA();
		da.start();
	}
}
