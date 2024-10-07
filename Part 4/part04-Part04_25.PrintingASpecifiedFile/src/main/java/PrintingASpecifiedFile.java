
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Which file should have its contents printed?");
        //String fileName = "d:\\Programming\\MOOC Java\\mooc-java-programming-i\\part04-Part04_25.PrintingASpecifiedFile\\" + scanner.nextLine();
        String fileName = scanner.nextLine();
        try (Scanner scannerText = new Scanner(Paths.get(fileName))) {
            while (scannerText.hasNextLine()){
                String row = scannerText.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            
        }
    }
}
