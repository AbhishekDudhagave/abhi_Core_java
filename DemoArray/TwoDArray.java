package DemoArray;

public class TwoDArray {
	public static void ex1(){
		int[][] arr={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		for (int i=0;i< arr.length;i++){
			for (int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void patterns(){
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				System.out.print(" * ");

			}
			System.out.println();
		}
	}
	public static void patterns2(){
		for (int i=1;i<=3;i++){
			for (int j=1;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void patterns3(){
		for (int i=1;i<=3;i++){
			for(int j=3;j>=i;j--){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void harry(){
		int n = 3;

		for(int i=1; i<=n; i++){
			for( int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void patterns4(){
		for(int i =1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}for(int i=1;i<=2;i++){
			for(int j=2;j>=i;j--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void patterns5(){
		for (int i=1;i<=3;i++){
			for(int j=3;j>=i;j--){
				System.out.print(" "+" ");
			}

//			for (int k=3;k>=i;k--){
//				System.out.print("*"+" ");
//			}System.out.println();
			for(int k=1;k<=i;k++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
//		ex1();
		patterns5();

	}
}
