package tk.zedlabs.testapplication;

public class Match {

    private String team1;
    private String team2;
    private String team1Logo;
    private String team2Logo;

    public Match(String team1, String team2, String team1Logo, String team2Logo) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1Logo = team1Logo;
        this.team2Logo = team2Logo;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getTeam1Logo() {
        return team1Logo;
    }

    public String getTeam2Logo() {
        return team2Logo;
    }


}


