import java.util.*;
public class Main  {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the department from the following \n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
        int n = sc.nextInt();
        switch(n)
        {
            case 1 : Technical obj= new Technical();
                     Employee em= new Employee();
                     CredentialService cs= new CredentialService();
                     String firstName=em.firstName();
                     String email = cs.generateEmailAddress(firstName, em.lastName(), obj.technical());
                     String password = cs.generatePassword();
                     cs.showCredentials(firstName, email, password);
                      break;
            case 2 : Admin am= new Admin();
                    Employee em1= new Employee();
                    CredentialService cs1= new CredentialService();
                    String firstName1=em1.firstName();
                    String email1 = cs1.generateEmailAddress(firstName1, em1.lastName(), am.admin());
                    String password1 = cs1.generatePassword();
                    cs1.showCredentials(firstName1, email1, password1);
                    break;
            case 3 : HumanResource hr= new HumanResource();
                     Employee em2= new Employee();
                     CredentialService cs2= new CredentialService();
                     String firstName2=em2.firstName();
                     String email2 = cs2.generateEmailAddress(firstName2, em2.lastName(), hr.humanresource());
                     String password2 = cs2.generatePassword();
                     cs2.showCredentials(firstName2, email2, password2);
                     break;
            case 4 : Legal l= new Legal();
            Employee em3= new Employee();
            CredentialService cs3= new CredentialService();
            String firstName3=em3.firstName();
            String email3 = cs3.generateEmailAddress(firstName3, em3.lastName(), l.legal());
            String password3 = cs3.generatePassword();
            cs3.showCredentials(firstName3, email3, password3);
            break;
            default : System.out.println("Invalid Input, Kindly enter again :");break;
        }
        
    }
}
