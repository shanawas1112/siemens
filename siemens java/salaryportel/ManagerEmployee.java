package salaryportel;

public class ManagerEmployee extends SalaryEmployee {

   

    private String managerEmployeeTeamSize;

    public ManagerEmployee(int salaryEmployeeId, String salaryEmployeeName, String salaryEmployeeDesignation,
    SalaryComponent salaryAmount, EmployeeAddress salaryemployeeAddress, String managerEmployeeTeamSize) {
super(salaryEmployeeId, salaryEmployeeName, salaryEmployeeDesignation, salaryAmount, salaryemployeeAddress );
this.managerEmployeeTeamSize= managerEmployeeTeamSize;
    }

@Override
public void calculateTax(){
try {
    double netPay = getSalaryAmount().getSalaryBasic()*0.2;
    System.out.println(netPay);
} catch (Exception e) {
    
    System.out.println(e.getCause());
}
finally{
    System.out.println("Done");
}
     
   
}
   
    
}
