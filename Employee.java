import java.util.*;
public class Employee extends Main
{
    Scanner sc = new Scanner(System.in);
 public String firstName()
 {
    System.out.println("Enter your first name");
    String firstName = sc.nextLine();
    return firstName;
 }
 public String lastName()
 {
    System.out.println("Enter your last name");
    String lastName = sc.nextLine();
    return lastName;
 }
}