package DemoThreading;

public class DemoThreadB implements Runnable{
	public void patternB(){
		for(int i=1;i<5;i++){
			System.out.print(" * ");
		}
	}

	@Override
	public void run() {
		System.out.println("Started Run Method !");
		patternB();
	}

	public static void main(String[] args) {
		DemoThreadB db=new DemoThreadB();
		Thread t2=new Thread(db);
		t2.start();
	}
}
