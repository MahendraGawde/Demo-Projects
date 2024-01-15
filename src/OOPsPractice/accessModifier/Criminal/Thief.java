package src.OOPsPractice.accessModifier.Criminal;

import src.OOPsPractice.accessModifier.Police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop fakeCop = new Cop(10);
        //not able to access private method canIShoot from Police folder classes
        //fakeCop.canIShoot();
        System.out.println(fakeCop.gun);

    }


}
