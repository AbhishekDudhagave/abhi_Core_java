package DemoThreading;

public class TableA implements Runnable{

Tables tab=new Tables();
	@Override
	public void run() {
		tab.runTables(5);
	}
}
