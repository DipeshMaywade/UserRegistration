import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistartionImplement implements RegistrationInterface {


    public void firstNameValid(String name){
        String regx = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            System.out.println("Entered Name is Valid");
        }
        else {
            System.out.println("Entered Name is Invalid");
        }
    }
}

