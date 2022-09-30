package LoginSystem;

import java.util.Scanner;

public class LoginPrompt {
    public static final Scanner input = new Scanner(System.in);
    public static String usernameLogin() {
        System.out.println("Enter Username:");
        String checkUsername = input.nextLine();
        return checkUsername;
    }
    public static final String passwordLogin() {
        System.out.println("Enter Password:");
        String checkPassword = input.nextLine();
        return checkPassword;
    }

}
