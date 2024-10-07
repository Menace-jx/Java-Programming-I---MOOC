
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> container = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        //String file = "d:\\Programming\\MOOC Java\\mooc-java-programming-i\\part04-Part04_27.IsItInTheFile\\" + scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner contentScanner = new Scanner(Paths.get(file))) {
            while (contentScanner.hasNextLine()) { 
                String row = contentScanner.nextLine();
                container.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (container.contains(searchedFor)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
