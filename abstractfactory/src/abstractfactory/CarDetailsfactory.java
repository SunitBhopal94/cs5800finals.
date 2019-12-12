package abstractfactory;
import abstractfactory.CarDetails;

public class CarDetailsfactory 
{
public static CarDetails getQuotes(CarAbstractFactory fac)
{
		return fac.createQuote();
	}
}