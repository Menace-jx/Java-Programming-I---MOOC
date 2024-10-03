
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());

            if (number != -1){
                stats.addNumber(number);
            } else{
                break;
            }
            
            if (number % 2 == 0){
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }

        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());


    }
}
