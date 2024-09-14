
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNums = 0;
        int sum = 0;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0){
                break;
            } else {
                totalNums ++;
                sum = sum + number;
            }
        }
        double average = 1.0 * sum/totalNums;
        System.out.println("Average of the numbers: " + average);
    }
}
