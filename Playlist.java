import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

    private ArrayList<Song> choices;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist(){
        choices = new ArrayList<Song>();
      }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

      public void addToPlaylist(Song a){
        choices.add(a);
      }

      public void likeLike(int b){
        choices.get(b).like();
      }

      public void removeFromPlaylist(Song c){
        choices.remove(c);
      }

      public String toString(){
        return "Songs: " + choices.toString();
      }

      
      public ArrayList<Song> getLikedSongs(){
        ArrayList<Song> likedSongs = new ArrayList<Song>();
        for (int i = 0; i < choices.size(); i++) {
          if(choices.get(i).getIfLiked() == true){
          likedSongs.add(choices.get(i));
          }
        }
          return likedSongs;
      }

      public String totalDuration(){
        int time = 0;
        for(int i = 0; i < choices.size(); i++){
           time += choices.get(i).getLength();
        }
        return (time / 60) + ":" + (time % 60);
      }


      public void removeUnlikedSongs(){
        for (int i = 0; i < choices.size(); i++) {
          if(choices.get(i).getIfLiked() == false){
          choices.remove(i);
          i--;
          }
        }   
      }
      
}
