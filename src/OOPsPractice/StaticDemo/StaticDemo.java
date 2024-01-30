package src.OOPsPractice.StaticDemo;

public class StaticDemo {

    public static String college_name= "The Testing Academy";
    public char className = 'A';
    public int countStudents=99;

    static void printName(){
        System.out.println("Name of college :" +college_name);
        //You can't have Instance variable into Static method as below example
        //System.out.println("NO. of students " +className);
    }

    //Non-static methods
    // We can call Static variable in non-static methods
    void printClassName(){
        System.out.println("Class name is " +className);
        System.out.println("Name of college :" +college_name);
    }

    void printCountStudents(){
        System.out.println("NO. of Students in class -> " +countStudents);
    }

}
