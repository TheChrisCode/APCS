package LoginSystem;

import static LoginSystem.Login.runLogin;
import static LoginSystem.UserInput.getPassword;
import static LoginSystem.UserInput.getUsername;

public class ValidInput {
    public static boolean hasDigit = false;
    public static boolean hasLetter = false;

    public static void checkPassword(String tempPassword, String tempUsername) {
        if (tempPassword.length() < 8) {
            System.out.println("Password to short!(8 characters minimum)");
            tempPassword = getPassword();
        }
        if (tempPassword.length() > 25) {
            System.out.println("Password to long!(25 characters max)");
            tempPassword = getPassword();
        }
        checkLetterDigit(tempPassword,tempUsername);
    }
    public static void checkLetterDigit(String tempPassword,String tempUsername) {
        for (int i = 0; i < tempPassword.length(); i++) {
            if (Character.isDigit(tempPassword.charAt(i)) == true) {
                hasDigit = true;
            }
            if (Character.isLetter(tempPassword.charAt(i)) == true) {
                hasLetter = true;
            }


            if (hasDigit == true && hasLetter == true) {
                System.out.println("Sign Up Successful!");

                runLogin(tempUsername, tempPassword);
            }
        }
    }
    public static void checkInput() {
        for (; ; ) {
            String tempUsername = getUsername();
            String tempPassword = getPassword();


            if (tempUsername.length() < 8) {
                System.out.println("Username to short!(8 characters minimum)");
                tempUsername = getUsername();
            }
            if (tempUsername.length() > 25) {
                System.out.println("Username to long!(25 characters max)");
                tempUsername = getUsername();
            }
            checkLetterDigit(tempPassword,tempUsername);

            if (hasDigit == false) {
                System.out.println("Invalid Password! Password Needs a Number!");
                tempPassword = getPassword();
                checkPassword(tempPassword, tempUsername);
            }
            if (hasLetter == false) {
                System.out.println("Invalid Password! Password Needs a Letter!");
                tempPassword = getPassword();
                checkPassword(tempPassword, tempUsername);
            }

            System.out.println(hasDigit);
            System.out.println(hasLetter);
            System.out.println("Checkpoint 1");
            checkPassword(tempPassword, tempUsername);


        }

    }
}


