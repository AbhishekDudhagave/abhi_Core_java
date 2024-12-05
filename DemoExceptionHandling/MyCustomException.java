package DemoExceptionHandling;

public class MyCustomException {
	static int balance=5000;

	public static Integer withdraw_amount(int amt){
		if(amt<=0){
			throw new ArithmeticException("Enter amount greater than Zero");
		}
		int leftBalance=balance-amt;
		return leftBalance;
	}
	public static void main(String[] args) {
int totalBalance=withdraw_amount(-777);
		System.out.println(totalBalance);
	}
}
