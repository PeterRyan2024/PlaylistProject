/**
 * File for a Song class to be used in the Playlist Project
 * @Peter Ryan, Nathan Taing
 * @1/21/24
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private int length;
    private boolean ifLiked;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myTitle, String myArtist, int myLength, boolean myIfLiked){
        title = myTitle;
        artist = myArtist;
        length = myLength;
        ifLiked = myIfLiked;
    }





     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public String getTitle(){
        return title;
      }

      public String getArtist(){
        return artist;
      }

      public double getLength(){
        return length;
      }

      public boolean getIfLiked(){
        return ifLiked;
      }

      public void like(){
        ifLiked = true;
      }

      public void unlike(){
        ifLiked = false;
      }

      public String toString(){
        return "\"" + title + "\" " + "by " + artist + " (" + length / 60 + ":" + length % 60 + ")";
      }

}
