package Bankaccountexample.java.constructorchaning;

public class Employee { 

    private String employeeId;
    private String employeeName;
    private String employeeProject;
    private String employeeDesignaing;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }


    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }


    public Employee(String employeeId, String employeeName, String employeeDesignaing) {
        this(employeeId, employeeName); //delegation,chanining
        this.employeeDesignaing = employeeDesignaing;
    }

    public Employee(String employeeId, String employeeName, String employeeProject, String employeeDesignaing) {
        this(employeeId, employeeName, employeeDesignaing);
        this.employeeProject = employeeProject;
        
    }
    
    
}
