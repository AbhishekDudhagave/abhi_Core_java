package DemoThreading;

public class TableB implements Runnable{
	Tables tab=new Tables();
	@Override
	public void run() {
		tab.runTables(6);
	}
}
