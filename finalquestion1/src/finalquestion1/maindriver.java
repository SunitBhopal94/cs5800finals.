package finalquestion1;

public class maindriver 
{
    private static Employee getEmployeesequence()
    {
        Employee partcollector = new Partcollector(Employee.PARTS_COLLECTOR);
        Employee assembler =  new Assembler(Employee.ASSEMBLER);
        Employee welder =  new Welder(Employee.WELDER);
        Employee painter = new Painter(Employee.PAINTER);

        partcollector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);

        return partcollector;
    }

    public static void main(String[] args) {
        Employee employeeChain = getEmployeesequence();

  

  System.out.println();   
        
        
        employeeChain.doWork(Employee.PARTS_COLLECTOR, "Order is in the parts dept.");
        employeeChain.doWork(Employee.ASSEMBLER,"order is in assembly line");
        employeeChain.doWork(Employee.WELDER, "order is in welding section");
        employeeChain.doWork(Employee.PAINTER, "order is in the paint section.");
    }

}
