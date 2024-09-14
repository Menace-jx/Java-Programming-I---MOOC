
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = number; number <= 100; i++){
            System.out.println(i);
            if (i == 100) {
                break;
            }
        }

    }
}
