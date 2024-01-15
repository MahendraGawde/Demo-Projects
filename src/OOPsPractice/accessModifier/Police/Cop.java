package src.OOPsPractice.accessModifier.Police;

public class Cop {

    public int gun;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Ok,..Shoot!");
    }
}
