package finalquestion1;

public class Assembler extends Employee {

    public Assembler(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println(message+"all parts have been put togther");
    }
}
