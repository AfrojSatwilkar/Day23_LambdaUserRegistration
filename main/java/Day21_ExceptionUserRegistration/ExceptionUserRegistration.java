package Day21_ExceptionUserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionUserRegistration {
    // validating last name
    public boolean lastName (String str){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
