package LoginSystem;
import java.util.Scanner;
public class UserInput {
    public static final Scanner input = new Scanner(System.in);
    public static String getUsername() {
        System.out.println("Create Username:");
        String username = input.nextLine();
        return username;
    }
    public static final String getPassword() {
        System.out.println("Create Password:");
        String password = input.nextLine();
        return password;
    }
}
