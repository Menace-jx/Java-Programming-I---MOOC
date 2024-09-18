
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Enter password: ");
        String passInput = scanner.nextLine();

        if (usernameInput.equals(username[0])){
            if (passInput.equals(password[0])){
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else if (usernameInput.equals(username[1])){
            if (passInput.equals(password[1])){
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
