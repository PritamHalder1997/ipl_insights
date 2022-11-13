package IPL;

class Team {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int point;
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    private Boolean[] wins;
    public Boolean[] getWins() {
        return wins;
    }
    public void setWins(Boolean[] wins) {
        this.wins = wins;
    }
    Team(String name, int point, Boolean[] wins) {
        this.name = name;
        this.point = point;
        this.wins = wins;
    }
}