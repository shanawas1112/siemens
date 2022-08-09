package salaryportel;


abstract public class SalaryEmployee {
   private int salaryEmployeeId;
   private String salaryEmployeeName;
   private String salaryEmployeeDesignation;
   private SalaryComponent salaryAmount;
   private EmployeeAddress salaryemployeeAddress; 




    public SalaryEmployee(int salaryEmployeeId, String salaryEmployeeName, String salaryEmployeeDesignation, SalaryComponent salaryAmount, EmployeeAddress salaryemployeeAddress) {
        this.salaryEmployeeId = salaryEmployeeId;
        this.salaryEmployeeName = salaryEmployeeName;
        this.salaryEmployeeDesignation = salaryEmployeeDesignation;
        this.salaryAmount = salaryAmount;
        this.salaryemployeeAddress = salaryemployeeAddress;
    }


    public int getSalaryEmployeeId() {
        return this.salaryEmployeeId;
    }

    public void setSalaryEmployeeId(int salaryEmployeeId) {
        this.salaryEmployeeId = salaryEmployeeId;
    }

    public String getSalaryEmployeeName() {
        return this.salaryEmployeeName;
    }

    public void setSalaryEmployeeName(String salaryEmployeeName) {
        this.salaryEmployeeName = salaryEmployeeName;
    }

    public String getSalaryEmployeeDesignation() {
        return this.salaryEmployeeDesignation;
    }

    public void setSalaryEmployeeDesignation(String salaryEmployeeDesignation) {
        this.salaryEmployeeDesignation = salaryEmployeeDesignation;
    }

    public SalaryComponent getSalaryAmount() {
        return this.salaryAmount;
    }

    public void setSalaryAmount(SalaryComponent salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public EmployeeAddress getSalaryemployeeAddress() {
        return this.salaryemployeeAddress;
    }

    public void setSalaryemployeeAddress(EmployeeAddress salaryemployeeAddress) {
        this.salaryemployeeAddress = salaryemployeeAddress;
    }


    @Override
    public String toString() {
        return "{" +
            " salaryEmployeeId='" + getSalaryEmployeeId() + "'" +
            ", salaryEmployeeName='" + getSalaryEmployeeName() + "'" +
            ", salaryEmployeeDesignation='" + getSalaryEmployeeDesignation() + "'" +
            ", salaryAmount='" + getSalaryAmount() + "'" +
            ", salaryemployeeAddress='" + getSalaryemployeeAddress() + "'" +
            "}";
    }
    
   
   abstract void calculateTax();
   
}
