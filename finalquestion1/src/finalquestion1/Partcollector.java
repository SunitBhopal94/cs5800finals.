package finalquestion1;

public class Partcollector extends Employee
{

    public Partcollector(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println(message+"all parts have been gathered");
    }
}
