package stringbasic;

public class Person {
    String name;
    String email;
    String taj;
    String bankAccountNo;
    String phoneNo;

    public Person(String name, String email, String taj, String bankAccountNo, String phoneNo) {
        this.name = name;
        this.email = email;
        this.taj = taj;
        this.bankAccountNo = bankAccountNo;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaj() {
        return taj;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
