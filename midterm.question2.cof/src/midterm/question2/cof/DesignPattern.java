package midterm.question2.cof;

public class DesignPattern
{
	public static void main(String []args)
	{
		Employee Employee1 = new Employee1("David","Programmer",1500);
		Employee Employee2 = new Employee2("scott","CEO",3000);
		
		Employee1.addCoworker(Employee1);

		Employee2.addCoworker(Employee2);
	System.out.println(Employee1);
	for(Employee headEmployee:Employee1.getCoworkers())
	{
		for(Employee Employee:headEmployee.getCoworkers()) {
			
		
		System.out.println(Employee);
	}
	
	}
	}
	
	
	



}
