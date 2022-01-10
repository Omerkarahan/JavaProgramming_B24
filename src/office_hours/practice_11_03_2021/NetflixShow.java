package office_hours.practice_11_03_2021;

public class NetflixShow extends Streaming{

    String showName;
    int episodeNumber;
    int seasonNumber;

    public NetflixShow(double duration, String showName, int episodeNumber, int seasonNumber){
        super("Netflix", duration); // calls line 7 in Streaming
        this.showName = showName;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

}

/*
create a class Netflix
-> Netflix is a child of Streaming
instance variables:
- show name (String)
- episode number (int)
- season number (int)
constructor:
- initialize name, company, duration, show name, episode number, and
season number
-> call super constructor
 */
