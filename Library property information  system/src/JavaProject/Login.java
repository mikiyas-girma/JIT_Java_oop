package JavaProject;

public class Login  {
    // predefined correct username and passwords
    private static final String USERNAME="1";
   private static final String PASSWORD="1";

   public static boolean checkCredentials(String username, String password){
       return
               USERNAME.equals(username) &&
               PASSWORD.equals(password);
   }
}
