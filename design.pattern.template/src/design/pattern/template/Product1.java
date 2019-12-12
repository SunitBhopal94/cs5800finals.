package design.pattern.template;
import design.pattern.template.Electrostore;
public class Product1 extends Electrostore
{
		@Override
		public void selectproduct() {
			System.out.println("Product selected is LEDTV");
		}

		@Override
		public void selectquantity() {
			System.out.println("Selected quantity is = 1");
		}

	}


