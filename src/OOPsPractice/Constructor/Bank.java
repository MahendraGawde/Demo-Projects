package src.OOPsPractice.Constructor;

public class Bank {

    String bankName;
    String bankCode;
    String location;

    Bank(){
        bankName = "SBI";
        bankCode = "SBI001";
        location = "Malad (E)";
    }
    Bank(String bCode, String bName, String loc){
        this.bankCode = bCode;
        this.bankName = bName;
        this.location = loc;
    }
    void bankDetails(){
        System.out.println(bankCode);
        System.out.println(bankName);
        System.out.println(location);
    }
}
