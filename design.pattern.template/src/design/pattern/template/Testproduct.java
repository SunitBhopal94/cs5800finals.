package design.pattern.template;
import design.pattern.template.Electrostore;
import design.pattern.template.Product1;
import design.pattern.template.Product2;
public class Testproduct 
{
public static void main(String[] args)
{
	
	    System.out.println("First Order Placed");
	    System.out.println("");
		Electrostore productype = new Product2();
		
		//using template method
		productype.purchaseproducts();
		System.out.println("");
		System.out.println("Second Order Placed");
		System.out.println("");
		productype = new Product1();
		productype.purchaseproducts();
	}


}
