
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String words = scanner.nextLine();
            if (!words.equals("")){
                String[] segments = words.split(" ");

                for (int i=0; i<segments.length; i++){
                    String avString = segments[i];
                    if (avString.contains("av")){
                        System.out.println(avString);
                    }
                }
            } else {
                break;
            }
        }
    }
}   
