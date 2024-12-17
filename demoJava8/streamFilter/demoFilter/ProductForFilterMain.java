package demoJava8.streamFilter.demoFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductForFilterMain {
	public static void main(String[] args) {
		
		ProductForFilter p1=new ProductForFilter("Laptop",25000);
		ProductForFilter p2=new ProductForFilter("Laptop",35000);
		ProductForFilter p3=new ProductForFilter("Laptop",45000);
		ProductForFilter p4=new ProductForFilter("Laptop",55000);
		
		
//		List<ProductForFilter> prod=new ArrayList<>();
		List<ProductForFilter> prod=Arrays.asList(p1,p2,p3,p4);
		
		List<ProductForFilter> premiumProd = prod.stream()
				.filter(n->n.productPrice>35000)
				.collect(Collectors.toList());
		
		System.out.println(premiumProd);
		
		//OR
//		prod.stream().filter(n->n.productPrice>35000).forEach(n->System.out.println(n));
		prod.stream().filter(n->n.productPrice>35000).forEach(System.out::println);
		
	}


}
