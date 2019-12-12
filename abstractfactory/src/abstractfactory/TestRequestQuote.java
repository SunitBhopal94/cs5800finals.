package abstractfactory;
import abstractfactory.CarDetails;
import abstractfactory.CarDetailsfactory;
import abstractfactory.Brand1factory;
import abstractfactory.Brand2factory;
public class TestRequestQuote 
 {

	public static void main(String[] args) {
		TestRequestQuote();
	}

	private static void TestRequestQuote() 
	{
		CarDetails brand1 =abstractfactory.CarDetailsfactory.getQuotes(new Brand1factory("Toyota","Camry2019","20000","1000"));
		CarDetails brand2 =abstractfactory.CarDetailsfactory.getQuotes(new Brand2factory("Honda","Accord2019","20400","1100"));
		System.out.println("Brand1 quote="+brand1);
		System.out.println("Brand2 quote="+brand2);
	}
}
