package src.OOPsPractice.Inheritance.Multilevel;

public class GrandFather {

    String property;
    String mobiles;

    GrandFather(){
        property ="Lamborghini car";
        mobiles="Nokia";
    }
    void bhk3(){
        System.out.println("I have 3 bhk");
    }
    GrandFather(String car, String mobile){
        this.property=car;
        this.mobiles=mobile;

    }

    void assetDetails(){
        System.out.println("GF property: " +property);
        System.out.println("GF mobiles: " +mobiles);
    }
}
