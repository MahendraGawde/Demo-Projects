package src.OOPsPractice.accessModifier.Police;

public class SubInspector {
    public static void main(String[] args) {
        Cop subInspector = new Cop(5);
        System.out.println(subInspector.gun);
        subInspector.canIShoot();
    }
}
