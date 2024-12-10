package DemoThreading;

public class Tables {

	public synchronized void runTables(int num){
		for (int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}
