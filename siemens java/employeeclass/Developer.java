package employeeclass;

public class Developer extends Employees{

   public String employeeDeveloperId;
   public String[] employeeLanguages;


    public Developer(String employeeDeveloperId, String[] employeeLanguages,String employeeName, int employeeAge, String employeedesignation, String employeeDepartment, float employeeSalary) {
       
     super(employeeName, employeeAge, employeedesignation, employeeDepartment, employeeSalary) ;     
        this.employeeDeveloperId = employeeDeveloperId;
        this.employeeLanguages = employeeLanguages;
    }


    
    
}
