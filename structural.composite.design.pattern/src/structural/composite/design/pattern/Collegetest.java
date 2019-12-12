package structural.composite.design.pattern;
import structural.composite.design.pattern.Students;
import structural.composite.design.pattern.Professor1;

public class Collegetest implements college
{

		 
		 public static void main(String[] args) 
		 {
		 Students s1 = new Students("john");
		 Students s2 = new Students("kim");
		 Students s3 = new Students("Bill");
		 Students s4 = new Students("steffany");
		 Students s5 = new Students("Chris");
		 Students s6 = new Students("Wendy");
		 
		 
		 
		 
		 Professor1 Pr1 = new Professor1("Prof Willam"); 
		 Pr1.addstudents(s1);
		 Pr1.addstudents(s2);
		 Pr1.addstudents(s3);
		 
		 Professor2 Pr2 = new Professor2("Prof Tim"); 
		 Pr2.addstudents(s4);
		 Pr2.addstudents(s5);
		 Pr2.addstudents(s6);
		
		 Pr1.PrintDetails();
		 Pr2.PrintDetails();
		 }

		@Override
		public void PrintDetails() {
			// TODO Auto-generated method stub
			
		}
		 
		}
	
	
	

