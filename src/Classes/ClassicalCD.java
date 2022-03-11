package Classes;

import java.util.ArrayList;
import java.util.Date;

public class ClassicalCD extends Item {
    private String composer;
    private String recordingLocation;
    private Date releaseDate;
    private ArrayList<String> performers = new ArrayList<String>();

    public void addPerformer(String performer){
        performers.add(performer);
    }

    public void showPerformers(){
        for (String string : performers) {
            System.out.println(string);
        }
    }

    public void setComposer(String composer){
        this.composer = composer;
    }

    public void setRecordingLocation(String recordingLocation){
        this.recordingLocation = recordingLocation;
    }

    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }

    public String getComposer(){
        return composer;
    }

    public String getRecordingLocation(){
        return recordingLocation;
    }

    public Date getReleaseDate(){
        return releaseDate;
    }
}
