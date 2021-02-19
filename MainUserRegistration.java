import java.util.Scanner;

public class MainUserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RegistartionImplement check = new RegistartionImplement();

       while (true){
           System.out.println("Enter Your First Name: ");
           String firstName = scan.nextLine();
           check.firstNameValid(firstName);

           System.out.println("Enter Your Last Name");
           String lastName = scan.nextLine();
           check.firstNameValid(lastName);

           System.out.println("Enter Your EmailID");
           String email = scan.nextLine();
           check.emailValid(email);

           System.out.println("Enter Your MobileNumber");
           String number = scan.nextLine();
           check.phoneValid(number);
       }
    }
}
