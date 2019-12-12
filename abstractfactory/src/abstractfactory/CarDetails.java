package abstractfactory;

public abstract class CarDetails {

	 public abstract String getBrandname();
	    public abstract String getModel();
	    public abstract String getBaseprice();
	    public abstract String getPaperWorkfee();
	    @Override
	    public String toString(){
	        return "Brandname= "+this.getBrandname()+", Model="+this.getModel()+", BasePrice="+this.getBaseprice()+",PaperWorkfee="+this.getPaperWorkfee();
	    }
	    
	}
