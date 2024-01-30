package src.OOPsPractice.StaticDemo;

public class Runner {
    public static void main(String[] args) {
        //System.out.println(StaticDemo.college_name);
        //StaticDemo.printName();
        StaticDemo s1 = new StaticDemo();
        s1.className = 'B';
        s1.printClassName();
        s1.countStudents=60;
        s1.printCountStudents();

        System.out.println("--- ---");

        StaticDemo.college_name = "Patkar College";

        StaticDemo s2= new StaticDemo();
        s2.className='C';
        s2.printClassName();
        s2.countStudents=39;
        s2.printCountStudents();


        System.out.println(StaticDemo.college_name);

    }
}
