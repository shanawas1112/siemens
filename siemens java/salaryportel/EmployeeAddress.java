package salaryportel;

public class EmployeeAddress {
    private String employeeAddressLocation;
    private int employeePinCode;
    private String employeeAddressState;
   



    public EmployeeAddress(String employeeAddressLocation, int employeePinCode, String employeeAddressState) {
        this.employeeAddressLocation = employeeAddressLocation;
        this.employeePinCode = employeePinCode;
        this.employeeAddressState = employeeAddressState;
    }


    public String getEmployeeAddressLocation() {
        return this.employeeAddressLocation;
    }

    public void setEmployeeAddressLocation(String employeeAddressLocation) {
        this.employeeAddressLocation = employeeAddressLocation;
    }

    public int getEmployeePinCode() {
        return this.employeePinCode;
    }

    public void setEmployeePinCode(int employeePinCode) {
        this.employeePinCode = employeePinCode;
    }

    public String getEmployeeAddressState() {
        return this.employeeAddressState;
    }

    public void setEmployeeAddressState(String employeeAddressState) {
        this.employeeAddressState = employeeAddressState;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeAddressLocation='" + getEmployeeAddressLocation() + "'" +
            ", employeePinCode='" + getEmployeePinCode() + "'" +
            ", employeeAddressState='" + getEmployeeAddressState() + "'" +
            "}";
    }
    


    


    
}
