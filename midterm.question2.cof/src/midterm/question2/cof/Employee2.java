package midterm.question2.cof;

public class Employee2 extends Employee
{

public Employee2(String name, String position, int wage) 
{
	super(name, position, wage);
	// TODO Auto-generated constructor stub
}



@Override
public String toString() 
{
	return"Employee:|Name:"+getName()+",Position:"+getPosition()+",Wage:"+getWage()+"|";
}
}
