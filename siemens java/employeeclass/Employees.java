package employeeclass;

public class Employees {
    private String employeeName;
    private int employeeAge;
    private String employeedesignation;
    private String employeeDepartment;
    private float employeeSalary;

    public Employees(String employeeName, int employeeAge, String employeedesignation, String employeeDepartment, float employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeedesignation = employeedesignation;
        this.employeeDepartment = employeeDepartment;
    }


    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return this.employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeedesignation() {
        return this.employeedesignation;
    }

    public void setEmployeedesignation(String employeedesignation) {
        this.employeedesignation = employeedesignation;
    }

    public String getEmployeeDepartment() {
        return this.employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public float getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "{" +
            " employeeName='" + getEmployeeName() + "'" +
            ", employeeAge='" + getEmployeeAge() + "'" +
            ", employeedesignation='" + getEmployeedesignation() + "'" +
            ", employeeDepartment='" + getEmployeeDepartment() + "'" +
            ", employeeSalary='" + getEmployeeSalary() + "'" +
            "}";
    }
    


    
}
