package abstractfactory;
import abstractfactory.CarDetails;
import abstractfactory.Brand1;
public class Brand1factory implements CarAbstractFactory 
{

	    private String brandname;
	    private String model;
	    private String baseprice;
	    private String paperworkfee;
	     

public Brand1factory(String brandname, String model, String baseprice,String paperworkfee)
{
	this.brandname=brandname;
    this.model=model;
    this.baseprice=baseprice;
    this.paperworkfee=paperworkfee;
   
}
@Override
public CarDetails createQuote()
{
	return new Brand1(brandname,model,baseprice,paperworkfee);
}

}