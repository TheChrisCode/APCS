package LoginSystem;
import static LoginSystem.LoginFail.runFail;
import static LoginSystem.LoginPrompt.passwordLogin;
import static LoginSystem.LoginPrompt.usernameLogin;
import static LoginSystem.LoginSuccessful.runLoginSuccessful;

public class Login {
    public static void runLogin(String trueUsername, String truePassword) {
        String username = usernameLogin();
        String password = passwordLogin();
        boolean works = false;
        if(truePassword.equals(password) && trueUsername.equals(username)) {
            runLoginSuccessful(trueUsername);
        }else {
            runFail(trueUsername,truePassword);
        }
    }

}
