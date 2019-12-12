package midterrm.ques3.factorypattern;

public class Manager extends Employee
{
	@Override
    void work()
    {
		System.out.println("managing other employees.");
    }
	@Override
	void takePause()
	{
		System.out.println("Taking a small break from managing employees.");
	}
	@Override
    void getPaid()
    {
		System.out.println("Getting paid for overseeing the developing the project");
    }
}
