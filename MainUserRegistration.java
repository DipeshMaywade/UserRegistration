import java.util.Scanner;

public class MainUserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RegistartionImplement check = new RegistartionImplement();

       while (true){
           System.out.println("Enter Your First Name: ");
           String firstName = scan.nextLine();
           check.firstNameValid(firstName);
       }
    }
}
