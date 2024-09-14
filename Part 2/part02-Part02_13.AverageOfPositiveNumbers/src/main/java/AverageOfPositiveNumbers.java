
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positives = 0;
        int sumOfPositives = 0;

        while (true) { 
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            } else if (number > 0) {
                positives ++;
                sumOfPositives = sumOfPositives + number;
            } else {
                continue;
            }
        }
        if (positives == 0){
            System.out.println("Cannot calulate the average");
        } else if (positives > 0){
            double average = 1.0* sumOfPositives/positives;
            System.out.println(average);
        }
        
    }
}
