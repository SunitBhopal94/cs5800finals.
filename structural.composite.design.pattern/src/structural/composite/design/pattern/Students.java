package structural.composite.design.pattern;

public class Students implements college
{
	
		 private String Name;
		 
		 public Students(String Name)
		 {
		 this.Name = Name;
		 }
		 
		 @Override
		 public void PrintDetails()
		 {
			 
		 System.out.println(Name);
		 }
		 
		
}
