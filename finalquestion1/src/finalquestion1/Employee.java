package finalquestion1;

public abstract class Employee // abstract class created which will be used by the other classes.
{
    public static int PARTS_COLLECTOR ;//variables initialized 
    public static int ASSEMBLER ;
    public static int WELDER;
    public static int PAINTER;

    protected int authorityLevel;
    protected Employee nextEmployee;

    public void setNextEmployee(Employee employee) {    //this method is about using the next employee when the previous employee's job is done
        this.nextEmployee = employee;
    }

    public void doWork(int authorityLevel, String message) {//this method is about which employee does which job.
        if (this.authorityLevel <= authorityLevel) {
            write(message);
        }
        if (nextEmployee != null) {
            nextEmployee.doWork(authorityLevel, message);
        }
    }

    abstract protected void write(String message);
}

   

   
