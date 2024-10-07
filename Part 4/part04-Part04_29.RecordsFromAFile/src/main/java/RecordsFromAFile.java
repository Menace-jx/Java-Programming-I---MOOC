

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> container = new ArrayList<>();
        //System.out.println("Name of the file:");
        String file = scanner.nextLine();
      
        //String file = "d:\\Programming\\MOOC Java\\mooc-java-programming-i\\part04-Part04_29.RecordsFromAFile\\" + scanner.nextLine();

        try (Scanner contentScanner = new Scanner(Paths.get(file))) {
            while (contentScanner.hasNextLine()){
                String row = contentScanner.nextLine();
                container.add(row);
            }
        } catch (Exception e) {
            System.out.println("Cannot read the file.");
        }

        for (String content:container){
            String[] parts = content.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age == 1){
                System.out.println(parts[0] + ", age: " + age + " year");
            } else {
                System.out.println(parts[0] + ", age: " + age + " years" );
            }
              
        }
    }
}
