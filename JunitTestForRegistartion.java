
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class JunitTestForRegistartion {

        @Test
        public void firstNameValid_thanTrue() {
            RegistartionImplement checkname= new RegistartionImplement();
            boolean output = checkname.firstNameValid("Dipesh");
            Assertions.assertEquals(true, output);
        }

        @Test
        public void secondNameValid_thanTrue() {
            RegistartionImplement checkname= new RegistartionImplement();
            boolean output = checkname.firstNameValid("Maywade");
            Assertions.assertEquals(true, output);
        }

        @Test
        public void emailValid_thanTrue() {
            RegistartionImplement checkEmail= new RegistartionImplement();
            boolean output = checkEmail.emailValid("abcDipesh@bl.co.in");
            Assertions.assertEquals(true, output);
        }

        @Test
        public void phoneValid_thanTrue() {
            RegistartionImplement checkPhone= new RegistartionImplement();
            boolean output = checkPhone.phoneValid("91 8269602271");
            Assertions.assertEquals(true, output);
        }

        @Test
        public void passwordValid_thanTrue() {
            RegistartionImplement checkPassword= new RegistartionImplement();
            boolean output = checkPassword.passwordValid("@123Dipesh");
            Assertions.assertEquals(true, output);
        }
    }

}
