package src.OOPsPractice.Constructor;

public class ParamConstExample {
    public static void main(String[] args) {
        /* We can initialise values for instance variables
        the object we created through Parameterized constructor
        and assign to objects */
        Bank bank = new Bank();
        bank.bankDetails();
        System.out.println("___ ___");
        Bank hdfc = new Bank("HDFC001","HDFC","Goregaon (E)");
        hdfc.bankDetails();
        System.out.println("___ ____");
        Bank icici = new Bank("ICICI002","ICICI","Bovivali (W)");
        icici.bankDetails();
    }
}
