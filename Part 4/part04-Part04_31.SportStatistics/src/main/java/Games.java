public class Games {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public Games (String homeTeam, String visitingTeam, int homePoints, int visitingPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }
    public String getVisitingTeam() {
        return visitingTeam;
    }
    public int getHomePoints() {
        return homePoints;
    }
    public int getVisitingPoints() {
        return visitingPoints;
    }

    public String toString() {
        return this.homeTeam + " V.S. " + this.visitingTeam + " Score: " + this.homePoints + " - " + this.visitingPoints; 
    }
}
