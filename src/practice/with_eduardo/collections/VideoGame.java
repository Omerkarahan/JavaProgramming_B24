package practice.with_eduardo.collections;

import java.util.Arrays;

public class VideoGame {

    private String gameName;
    private int releaseYear;
    private String[] platform;

    VideoGame(String gameName, int releaseYear, String[] platform) {
        this.gameName = gameName;
        this.releaseYear = releaseYear;
        this.platform = platform;
    }

    public void setGameName(String gameName) { this.gameName = gameName; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
    public void setPlatform(String[] platform) { this.platform = platform; }

    public String getGameName() { return gameName; }
    public int getReleaseYear() { return releaseYear; }
    public String[] getPlatform() { return platform; }

    @Override
    public String toString() {
        return String.format("Game: %s, Year: %d, Platform: %s", gameName, releaseYear,
                Arrays.toString(platform));

    }}