package finalquestion1;


public class Welder extends Employee {

    public Welder(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println(message+"all parts have been welded togther");
    }
}
