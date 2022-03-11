package Classes;

import java.util.Date;

public class CD extends Item {
    private Artist artist;
    private Date releaseDate;

    public final Artist getArtist(){
        return artist;
    }

    public final void setArtist(Artist artist){
        this.artist =  artist;
    }

    public final Date getReleaseDate(){
        return releaseDate;
    }

    public final void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }
}
