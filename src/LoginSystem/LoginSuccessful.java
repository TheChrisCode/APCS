package LoginSystem;

public class LoginSuccessful {
    public static void runLoginSuccessful(String trueUsername){
        for(int i = trueUsername.length()-1; i >= 0; i--) {
            System.out.print(trueUsername.charAt(i));
        }
        System.exit(0);
    }
}
