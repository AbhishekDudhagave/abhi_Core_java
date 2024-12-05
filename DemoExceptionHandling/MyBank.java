package DemoExceptionHandling;

public class MyBank {
	static int balance=5000;
//	public static int showBalance(){
//		if (balance<=0){
//			try {
//				throw new ZeroBalance("Your balance is Zero");
//			} catch (ZeroBalance e) {
//				throw new RuntimeException(e);
//			}
//		}
//		return balance;
//	}
	//OR Using "THROWS" keyword
public static int showBalance()throws ZeroBalance{
	if (balance<=0){

			throw new ZeroBalance("Your balance is Zero");

	}
	return balance;
}

	public static int withDraw(int amt)  {
		if (amt<=0){
			try {
				throw new ZeroBalance("Amount should be greater than zero");
			} catch (ZeroBalance e) {
				throw new RuntimeException(e);
			}
		}
		int leftBalance=balance-amt;
		return leftBalance;
	}

	public static void main(String[] args) {
		int checkBalance=showBalance();
		System.out.println(checkBalance);

		System.out.println("--------------");

		int leftBalance=withDraw(10);
		System.out.println(leftBalance);
	}
}
