package midterm.question2.cof;


import midterm.question2.cof.Employee; 

public class Employee1 extends Employee 
{
	public Employee1(String name, String position, int wage) {
		super(name, position, wage);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() 
	{
		return"Employee:|Name:"+getName()+",Position:"+getPosition()+",Wage:"+getWage()+"|";
	}
}
