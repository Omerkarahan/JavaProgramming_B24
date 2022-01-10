package office_hours.practice_10_21_2021;

public class Sport {

    private String name;
    private int numberOfPlayer;
    private boolean isTeamBased;

    public Sport(String name, int numberOfPlayer, boolean isTeamBased) {
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.isTeamBased = isTeamBased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public boolean isTeamBased() {
        return isTeamBased;
    }

    public void setTeamBased(boolean teamBased) {
        isTeamBased = teamBased;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", isTeamBased=" + isTeamBased +
                '}';
    }
}


/*
    read-only: only able to see the values, not changes them (only getters)
    write-only: only able to change the values, not see them (only setters)
 */

/*
Create a class called Sport
- instance variables: name, number of players, team based (boolean)
- Create a constructor to initialize the three fields
- Encapsulate the variables
- Bonus: pervent negative number of players to assigned and null or empty space to be assigned to name
 */