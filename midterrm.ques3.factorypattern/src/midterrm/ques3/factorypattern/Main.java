package midterrm.ques3.factorypattern;
import java.io.*;    

public class Main
{  
	    public static void main(String args[])throws IOException
	    {  
	      Employeefactory employeeFactory = new Employeefactory();  
	        
	      System.out.print("Programmer");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String empName=br.readLine();  
	      System.out.print("Manager ");  
	       
	  
	      Employee e = Employeefactory.getEmp(empName);  
	     
	       System.out.print("Programmer ");  
	           e.work();
	           e.takePause();  
	           e.getPaid();
	    }
}

	    