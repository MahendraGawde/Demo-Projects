package src.OOPsPractice.Inheritance.Multilevel;

public class Father extends GrandFather{
    String property;
    String mobiles;
    void bhk2(){
        System.out.println("I have 2bhk");
    }

    Father(){
        System.out.println("Father Constructor");
    }

    Father(String propFather, String mobileF){
        this.property=propFather;
        this.mobiles=mobileF;
    }
    void assetDetails(){
        System.out.println("Father ki property: " +this.property);
        System.out.println("Father ka mobile: " +this.mobiles);
    }

}
