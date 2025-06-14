import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    public static boolean data( String login,String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean flag = false;
        if(login.length()>20){
            throw new WrongLoginException();
        }
        String regex = "^(?!.*\\s)(?=.*\\d).+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(!matcher.matches()){
            throw new WrongPasswordException("Wrong password!");
        }
        if(password.equals(confirmPassword)){
            flag = true;
        }
        return flag;
    }
}
