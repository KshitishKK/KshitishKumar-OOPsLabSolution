import java.util.*;
public class CredentialService extends Main {
     public String generatePassword() 
     {
                String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&stopabcdefghijklmnopqrstuvwxyz";
                Random rnd = new Random();
                StringBuilder sb = new StringBuilder(8);
                for (int i = 0; i < 8; i++)
                    sb.append(chars.charAt(rnd.nextInt(chars.length())));
                return sb.toString();
     }
    public String generateEmailAddress(String f, String l, String c)
    {
        String email= (f+l+"@"+c+".abc.com");
        return email;
    }
    public void showCredentials(String f, String e, String p)
    {
        System.out.println("Dear " + f + " your generated credentials are as follows\nEmail --> " + e + "\nPassword --> " + p);
    }
}
