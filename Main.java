import IPL.*;

public class Main {
    public static void main(String []args) {
        ScoreBoard s = new ScoreBoard();
        Team[] twoConsecutiveLosses = s.getConsecutiveOutcomes(false, 2);
        System.out.println("Teams: ");
        for (int i = 0; i < twoConsecutiveLosses.length; i++) {
            System.out.println(twoConsecutiveLosses[i]);
        }
        float averagePont = s.getAveragePoint(twoConsecutiveLosses);
        System.out.println("Average Point: ");
        System.out.println(averagePont);
    }   
}
