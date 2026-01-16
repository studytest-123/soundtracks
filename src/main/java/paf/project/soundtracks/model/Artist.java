package paf.project.soundtracks.model;

public class Artist {
    private Long artistId;
    private String artistName;
    private String artistGenre;
    private String artistCountry;
    private String artistDescription;

    // constructors
    public Artist() {
    }
    
    public Artist(Long artistId, String artistName, String artistGenre, String artistCountry, String artistDescription) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
        this.artistCountry = artistCountry;
        this.artistDescription = artistDescription;
    }
    
    // getters and setters
    public Long getArtistId() {
        return artistId;
    }   
    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }
    public String getArtistName() {
        return artistName;
    }   
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public String getArtistGenre() {
        return artistGenre;
    }   
    public void setArtistGenre(String artistGenre) {
        this.artistGenre = artistGenre;     
    }   
    public String getArtistCountry() {
        return artistCountry;
    }   
    public void setArtistCountry(String artistCountry) {
        this.artistCountry = artistCountry;
    }   
    public String getArtistDescription() {
        return artistDescription;
    }   
    public void setArtistDescription(String artistDescription) {
        this.artistDescription = artistDescription;
    }
}
