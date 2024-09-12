
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first  = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        //sum
        int sum = first + second;
        //difference
        int difference = first - second;
        //product
        int product = first * second;
        //quotient
        double quotient = (double) first / second;
        
        //print
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + difference);
        System.out.println(first + " * " + second + " = " + product);
        System.out.println(first + " / " + second + " = " + quotient);
    }
}
