package DemoArray;

public class OneDArray {
	public static void ex1(){
		int[] arr={1,2,3,4};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public static void ex2(){
		int[] arr=new int[5];
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;

		for(int i=0;i< arr.length;i++){
			System.out.println(arr[i]);
		}

	}
	public static void array_using_foreach(){
	int[] arr={33,444,55,66};
	for(int i :arr){
		System.out.println(i);
	}
	}
	public static void pass_arr(int[] arr){
		for(int i: arr){

				System.out.println(" value is "+ i);

		}
	}
	public static void main(String[] args) {
//		ex1();
//		System.out.println("----------");
//		ex2();
//		System.out.println("----------");
//		array_using_foreach();
		int[] arrdemo={55,3,2,5};
		pass_arr(arrdemo);
//	pass_arr(new int[] {55,3,2,5});
	}
}
