package midterrm.ques3.factorypattern;

public class Employeefactory 
{
	 public static Employee getEmp(String EmpType)
	 {  
         if(EmpType == null)
         {  
          return null;  
         }  
       if(EmpType.equalsIgnoreCase("Programmer")) {  
              return new Programmer();  
            }   
        else if(EmpType.equalsIgnoreCase("Manager")){  
             return new Manager();  
         }   
       
       
   return null;  
}  
}
	
