import java.util.Objects;


public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    
    @Override
    public boolean equals(Object song){
        /*if(!(song instanceof Song))
            return false;*/
        
        
       Song compareSongs = (Song) song;
       if(this.name.equals(compareSongs.name) && 
            (this.artist.equals(compareSongs.artist)) &&
               (this.durationInSeconds == compareSongs.durationInSeconds)){
                    return true;
       }else return false;
       
       
    }

    /*@Override
        public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.artist);
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + this.durationInSeconds;
        return hash;
    }*/
    
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
