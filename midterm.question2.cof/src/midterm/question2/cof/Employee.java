package midterm.question2.cof;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee 
{
	private String name;
	private String position;
	private int wage;
	private List<Employee> coworkers;
	
	public Employee(String name,String position,int wage)
	{
		this.setName(name);
		this.setPosition(position);
		setCoworkers(new ArrayList<Employee>());
		}
	
	public void addCoworker(Employee employee)
	{
		getCoworkers().add(employee);
	}
	public void removeCoworker(Employee employee)
	{
		getCoworkers().remove(employee);
	}
	public List<Employee>getCoworker(Employee employee)
	{
		return getCoworkers();
	}
	public abstract String toString();
   //{
	  // return"Employee:|Name:"+name+",Position:"+position+",Wage:"+wage+"|";

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getCoworkers() {
		return coworkers;
	}

	public void setCoworkers(List<Employee> coworkers) {
		this.coworkers = coworkers;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}
			   
	   
   
}
