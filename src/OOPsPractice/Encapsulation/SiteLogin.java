package src.OOPsPractice.Encapsulation;
/*
Encapsulation - Encapsulation in Java refers to integrating data (variables) and code (methods)
into a single unit. In encapsulation, a class's variables are hidden from other classes and can
only be accessed by the methods of the class in which they are found.
In below example we are keeping access to log in username and password variables as Private so that
they won't be misuse outside class for login mechanism.
*/


public class SiteLogin {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private final String password;

    SiteLogin(String uname, String pwd){
        this.username=uname;
        this.password=pwd;
    }

    boolean isLoggedIn(String username, String password){
        if(this.username.toLowerCase().equals(username)&& this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged in!!");
            return true;
        }else{
            System.out.println("Wrong Credentials X");
            return false;
        }


    }
}
