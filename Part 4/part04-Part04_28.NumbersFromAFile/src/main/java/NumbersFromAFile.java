
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        //String file = "d:\\Programming\\MOOC Java\\mooc-java-programming-i\\part04-Part04_28.NumbersFromAFile\\" + scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner contentScanner = new Scanner(Paths.get(file))){
            while (contentScanner.hasNextLine()){
                int number = Integer.valueOf(contentScanner.nextLine());
                numbers.add(number);
            }
        } catch (Exception e) {
            System.out.println("Cannot read the given file.");
        }

        for (int number:numbers){
            if (number>=lowerBound && number<=upperBound){
                count++;
            }
        }
        System.out.println("Numbers: " + count);


    }

}
