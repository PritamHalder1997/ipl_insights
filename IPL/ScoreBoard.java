package IPL;
import java.util.*;


public class ScoreBoard {

    private Team[] teams;

    public ScoreBoard() {
        this.teams = new Team[]{
            new Team("GT", 20, new Boolean[]{true, true, false, false, true}),
            new Team("LSG", 18, new Boolean[]{true, false, false, true, true}),
            new Team("RR", 16, new Boolean[]{true, false, true, false, false}),
            new Team("DC", 14, new Boolean[]{true, true, false, true, false}),
            new Team("RCB", 14, new Boolean[]{false, true, true, false, false}),
            new Team("KKR", 12, new Boolean[]{false, true, true, false, true}),
            new Team("PBKS", 12, new Boolean[]{false, true, false, true, false}),
            new Team("SRH", 12, new Boolean[]{true, false, false, false, false}),
            new Team("CSK", 8, new Boolean[]{false, false, true, false, true}),
            new Team("MI", 6, new Boolean[]{false, true, false, true, true}),
        };
    }
    ScoreBoard(Team[] teams) {
        this.teams = teams;
    }

    /**
     * Finds the teams that have n number of consecutive wins or losses.
     * @param win true to find consecutive wins and false to find consecutive losses.
     * @param matchCount number/count of consecutive matchs
     * @return Team[] array of team that have n number of consicutive wins/losses
     * @throws IllegalArgumentException throws when {@param matchCount} is zero
     */
    public Team[] getConsecutiveOutcomes(Boolean win, int matchCount) throws IllegalArgumentException {
        if (matchCount == 0) {
            throw new IllegalArgumentException("Wrong Parameter. matchCount shuld be more than 0");
        }
        List<Team> result = new ArrayList<Team>();
        for (int i = 0; i < this.teams.length; i++) {
            Team t = this.teams[i];
            int consecutiveWinsOrLosses = 0;
            for (int j = 0; j < t.getWins().length; j++) {
                Boolean w = t.getWins()[j];
                if (w == win) {
                    consecutiveWinsOrLosses++;
                } else {
                    consecutiveWinsOrLosses = 0;
                }
                if (consecutiveWinsOrLosses >= matchCount) {
                    result.add(t);
                    break;
                }
            }
        }
        return result.toArray(new Team[result.size()]);
    }


    /**
     * Calculates average point of teams
     * @param teams array of teams.
     * @return average point of teams.
     */
    public float getAveragePoint(Team[] teams) {
        if (teams.length == 0) {
            return 0;
        }
        int totalPoints = 0;
        for (int i = 0; i < teams.length; i++) {
            totalPoints += teams[i].getPoint();
        }
        return totalPoints / teams.length;
    }
}
