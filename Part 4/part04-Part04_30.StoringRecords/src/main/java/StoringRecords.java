
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();
        //String file = "d:\\Programming\\MOOC Java\\mooc-java-programming-i\\part04-Part04_30.StoringRecords\\" + scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try (Scanner contentScanner = new Scanner(Paths.get(file))) {
            while(contentScanner.hasNextLine()){
                String row = contentScanner.nextLine();
                String[] splitter = row.split(",");
                String name = splitter[0];
                int age = Integer.valueOf(splitter[1]);

                persons.add(new Person(name, age));

            }
        } catch (Exception e) {
            System.out.println("File can't be read!");
        }
        
        return persons;

    }
}
