
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<>();
        int sum = 0;
        int counter = 0;
        int nameLengthLongest = 0;
        String longestName = "";
        while(true){
            String nameYear = scanner.nextLine();
            if (nameYear.equals("")){
                break;
            }

            String[] splitNY = nameYear.split(",");

            names.add(splitNY[0]);
            
            int year = Integer.valueOf(splitNY[1]);
            sum += year;
            counter ++;
        }
        for (String name:names){
            int nameLength = name.length();
            if (nameLength > nameLengthLongest){
                nameLengthLongest = nameLength;
                longestName = name;
            }
        }
        double aveYears = (double) sum / counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + aveYears);

    }
}
