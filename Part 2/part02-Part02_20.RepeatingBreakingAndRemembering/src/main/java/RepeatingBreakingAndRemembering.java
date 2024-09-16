
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numOfNums = 0;  
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            //Break if number is -1
            if (number == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            //Count the numbers except -1
            if (number != -1){
                numOfNums ++;
            }
            //Count and check if number is odd or even
            if (number % 2 == 0){
                even ++;
            } else {
                odd ++;
            }
            //Sum of numbers
            sum += number;            
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNums);
        double average = (double) sum/ numOfNums;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
