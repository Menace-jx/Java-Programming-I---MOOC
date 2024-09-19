
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while (true) { 
            String words = scanner.nextLine();

            if (!words.equals("")){
                String[] wordArray = words.split(" ");

                for (int i = 0; i< wordArray.length; i++){
                System.out.println(wordArray[i]);
                }
            } else {
                break;
            }
                
        }

    }
}
