package employeeportal;

public class Manager extends Employee {
    private String managerLocation;
    private int managerTeamsize;

    public Manager(String employeeName, int employeeAge, Gender employeeGender, String employeeDesignation, float employeeSalary, String managerLocation,int managerTeamsize) {
        super(employeeName, employeeAge, employeeGender, employeeDesignation, employeeSalary);

        this.managerLocation = managerLocation;
        this.managerTeamsize = managerTeamsize;
    }

    
}
