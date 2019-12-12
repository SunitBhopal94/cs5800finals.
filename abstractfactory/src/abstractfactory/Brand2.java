package abstractfactory;
public class Brand2 extends CarDetails
{
	 private String brandname;
	    private String model;
	    private String baseprice;
	    private String paperworkfee;
	     
	    public Brand2(String brandname, String model, String baseprice,String paperworkfee)
	    {
	        this.brandname=brandname;
	        this.model=model;
	        this.baseprice=baseprice;
	        this.paperworkfee=paperworkfee;
	    }
	    @Override
	    public String getBrandname() 
	    {
	        return this.brandname;
	    }
	 
	    @Override
	    public String getModel()
	    {
	        return this.model;
	    }
	 
	    @Override
	    public String getBaseprice()
	    {
	        return this.baseprice;
	    }
	    @Override
	    public String getPaperWorkfee()
	    {
	        return this.paperworkfee;
	    }
	}




