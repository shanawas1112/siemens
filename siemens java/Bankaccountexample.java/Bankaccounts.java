package Bankaccount.java;

public class Bankaccounts {
    String bankAccountHolder;
    int bankCustomerid;
    int bankNumber;
    int bankIfsc;


    public Bankaccounts(String bankAccountHolder, int bankCustomerid, int bankNumber, int bankIfsc) {
        this.bankAccountHolder = bankAccountHolder;
        this.bankCustomerid = bankCustomerid;
        this.bankNumber = bankNumber;
        this.bankIfsc = bankIfsc;
    }

    public String getBankAccountHolder() {
        return this.bankAccountHolder;
    }

    public void setBankAccountHolder(String bankAccountHolder) {
        this.bankAccountHolder = bankAccountHolder;
    }

    public int getBankCustomerid() {
        return this.bankCustomerid;
    }

    public void setBankCustomerid(int bankCustomerid) {
        this.bankCustomerid = bankCustomerid;
    }

    public int getBankNumber() {
        return this.bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public int getBankIfsc() {
        return this.bankIfsc;
    }

    public void setBankIfsc(int bankIfsc) {
        this.bankIfsc = bankIfsc;
    }

    @Override
    public String toString() {
        return "{" +
            " bankAccountHolder='" + getBankAccountHolder() + "'" +
            ", bankCustomerid='" + getBankCustomerid() + "'" +
            ", bankNumber='" + getBankNumber() + "'" +
            ", bankIfsc='" + getBankIfsc() + "'" +
            "}";
    }


    
}
