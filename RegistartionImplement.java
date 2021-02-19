import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistartionImplement implements RegistrationInterface {


    public void firstNameValid(String name){
        String regx = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            System.out.println("Entered Name Valid");
        }
        else {
            System.out.println("Entered Name is Invalid");
        }
    }

    public void emailValid(String email) {
        String regx = "^abc[a-zA-Z0-9.]*@bl[.]co[.][a-z]{2,3}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("Entered Email is Valid");
        }
        else {
            System.out.println("Entered Email is Invalid");
        }
    }
    public void phoneValid(String phoneNumber) {
        String regx = "^[0-9]{2}[: :][0-9]{10}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Entered MobileNo. is Valid");
        } else {
            System.out.println("Entered MobileNo. is Invalid");
        }
    }

}

