package LoginSystem;

import static LoginSystem.LockOut.runLockOut;
import static LoginSystem.Login.runLogin;
import static LoginSystem.UserInput.getPassword;
import static LoginSystem.UserInput.getUsername;
import static LoginSystem.ValidInput.checkInput;

public class LoginFail {
    static int attempts = 2;
    public static void runFail(String username, String password){
        if (attempts == 0) {
            runLockOut();

        }

            System.out.println("Incorrect Login or Password! Try Again!");
            System.out.println("You have " + attempts + " attempts left!");
            attempts--;
            runLogin(username, password);


    }
}
