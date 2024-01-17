package src.OOPsPractice.Encapsulation;

public class Runner {
    public static void main(String[] args) {
        SiteLogin loginUser = new SiteLogin("admin","password");
        String userCredname = loginUser.getUsername();
        System.out.println(userCredname);

        //loginUser.setUsername("admin1");

        boolean check = loginUser.isLoggedIn("admin","admin");
        System.out.println(check);

    }
}
