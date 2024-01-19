import java.util.ArrayList;

/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here

       Playlist greatSongs = new Playlist();
       Song centuries = new Song("Centuries", "Fall Out Boys", 228, false);
       Song burntRice = new Song("Burnt Rice", "Shawn Wasabi", 120, false);
       Song countingStars = new Song("Counting Stars", "OneRepublic", 258 , false);
       Song vivaLaVida = new Song("Viva La Vida", "Coldplay", 242, false);
       Song pokerFace = new Song("Poker Face", "Lady Gaga", 237, false);
       Song dieYoung = new Song("Die Young", "Kesha", 212, false);
       Song mrBlueSky = new Song("Mr. Blue Sky", "Electric Light Orchestra", 303, false);

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */

         greatSongs.addToPlaylist(centuries);
         greatSongs.addToPlaylist(burntRice);
         greatSongs.addToPlaylist(countingStars);
         greatSongs.addToPlaylist(vivaLaVida);
         greatSongs.addToPlaylist(pokerFace);
         greatSongs.addToPlaylist(dieYoung);
         greatSongs.addToPlaylist(mrBlueSky);



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(greatSongs.toString());

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        greatSongs.likeLike(1);
        greatSongs.likeLike(2);
        greatSongs.likeLike(4);

        System.out.println("Printing the songs...\n");
        System.out.println(greatSongs.toString());

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        greatSongs.removeFromPlaylist(dieYoung);
        greatSongs.removeFromPlaylist(countingStars);

        System.out.println("Printing the songs...\n");
        System.out.println(greatSongs.toString());

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(greatSongs.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        greatSongs.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(greatSongs.toString());
    }
}
