
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        int oldestAge = 0;
        while (true) { 
            String nameAge = scanner.nextLine();
            if (nameAge.equals("")){
                break;
            }

            String[] splitStrings = nameAge.split(",");
            int age = Integer.valueOf(splitStrings[1]);
            if (age > oldestAge){
                oldestAge = age;
                oldestName = splitStrings[0];
            }
                    
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
