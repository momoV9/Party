package be.thomasmore.party.model;

public class Artist {
    private int id;
    private String artistName;
    private String linkMoreInfo;
    private String genre;
    private String bio;
    private String portfolio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBio() {
        return bio;
    }

    public Artist(int id, String artistName, String linkMoreInfo, String genre, String bio, String portfolio) {
        this.id = id;
        this.artistName = artistName;
        this.linkMoreInfo = linkMoreInfo;
        this.genre = genre;
        this.bio = bio;
        this.portfolio = portfolio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }
}
