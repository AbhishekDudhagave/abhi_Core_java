package DemoExceptionHandling;

public class DemoExceptionArray {
	public static void main(String[] args) {
		int [] arr1={1,2,3,4};
		try{
			System.out.println(arr1[5]);

			try{
				System.out.println(arr1[5]);
			}catch (ArrayStoreException ee){
				ee.printStackTrace();
			}
		}catch (ArithmeticException ar){
			ar.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException arex){
			arex.printStackTrace();
		}
		catch (Exception ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}
}
