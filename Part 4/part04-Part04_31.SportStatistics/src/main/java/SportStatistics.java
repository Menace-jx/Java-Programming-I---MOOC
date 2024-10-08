
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Games> games = new ArrayList<>();
        
        System.out.println("File:");
        String file = scan.nextLine();
        //String file = "d:\\Programming\\MOOC Java\\mooc-java-programming-i\\part04-Part04_31.SportStatistics\\" + scan.nextLine();
        try (Scanner contentScanner = new Scanner(Paths.get(file))){
            while (contentScanner.hasNextLine()){
                String row = contentScanner.nextLine();
                String[] splitter = row.split(",");
                
                //Assign per Array index
                String homeTeam = splitter[0];
                String visitingTeam = splitter[1];
                int homePoints = Integer.valueOf(splitter[2]);
                int visitingPoints = Integer.valueOf(splitter[3]);

                games.add(new Games(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception e) {
            System.out.println("Can't read the file!");
        }

        int count = 0;
        int win = 0;
        int lose = 0;
        System.out.println("Team:");
        String team = scan.nextLine();
        
        for (Games game:games){
            if (game.getHomeTeam().contains(team)){
                count++;
                if (game.getHomePoints() > game.getVisitingPoints()){
                    win++;
                } else {
                    lose++;
                }
            }
            if (game.getVisitingTeam().contains(team)){
                count++;
                if (game.getVisitingPoints() > game.getHomePoints()){
                    win++;
                } else {
                    lose++;
                }
            }

        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);

    }

}
