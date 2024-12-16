package demoJava8;

public class AreaMain {
	public static void main(String[] args) {

		Area aa=(num1,num2)->{

		double res=0.5*(num1*num2);
		return res;
		};
		
		double result=aa.areaOfTriangle(6,7);

		System.out.println(result);
	}
}
