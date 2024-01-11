package src.OOPsPractice.Inheritance.Multilevel;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Son tony = new Son();
        tony.bhk3();
        tony.bhk2();
        tony.bhk1();
        Father howard= new Father("Volkswagon","Samsung");
        howard.bhk2();
        howard.bhk3();
        GrandFather stark = new GrandFather("tesla","apple iphone");
        stark.bhk3();


        System.out.println("____ _____");
        tony.assetDetails();
        howard.assetDetails();
        stark.assetDetails();


    }
}
