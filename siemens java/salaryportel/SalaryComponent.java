package  salaryportel;


public class SalaryComponent{
    private float salaryBasic;
    private float salaryProfessionalTax;
    private float salaryTdsAmount;
    

    

    public SalaryComponent(float salaryBasic, float salaryProfessionalTax) {
        this.salaryBasic = salaryBasic;
        this.salaryProfessionalTax = salaryProfessionalTax;

        
    }

    public SalaryComponent(float salaryBasic, float salaryProfessionalTax, Float salaryTdsAmount) {
        this(salaryBasic, salaryProfessionalTax);
        this.salaryTdsAmount = salaryTdsAmount;

    }

    public float getSalaryBasic() {
        return this.salaryBasic;
    }

    public void setSalaryBasic(float salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public float getSalaryProfessionalTax() {
        return this.salaryProfessionalTax;
    }

    public void setSalaryProfessionalTax(float salaryProfessionalTax) {
        this.salaryProfessionalTax = salaryProfessionalTax;
    }

    public float getSalaryTdsAmount() {
        return this.salaryTdsAmount;
    }

    public void setSalaryTdsAmount(float salaryTdsAmount) {
        this.salaryTdsAmount = salaryTdsAmount;
    }

    @Override
    public String toString() {
        return "{" +
            " salaryBasic='" + getSalaryBasic() + "'" +
            ", salaryProfessionalTax='" + getSalaryProfessionalTax() + "'" +
            ", salaryTdsAmount='" + getSalaryTdsAmount() + "'" +
            "}";
    }


}