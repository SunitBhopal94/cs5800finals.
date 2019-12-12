package design.pattern.template;

public abstract class Electrostore
{
	public final void purchaseproducts()
	{
		selectproduct();
		selectquantity();
		placeorder();
		ordership();
		System.out.println("Order is on its way");
	}
	
	public abstract void selectproduct();
	
	public abstract void selectquantity();
	
	
	private void placeorder()
	{
		System.out.println("please fill payment details and press checkout ");
	}


	private void ordership()
	{
		System.out.println("Order has been placed and is ready to ship");
	}

	
	


}
