/* You and a friend have a 99% music compatibility score!
You are provided with two arrays containing all the music you both played recently. Let's find out if you were listening to the same playlist!
Here's the catch- the songs are shuffled and are listed by their song codes!
To find out if these two playlists are the same, we can use the .sort() method on both arrays and the .equals() method to see if both sorted arrays are the same.
Print "This is the same playlist!" if they are the same. Otherwise, print "No match was found." (These playlists should match!). */

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖
        int[] playlistA = {
            3094234, 12323, 90990, 373737, 128732, 4388934, 2343947, 6548234, 234823, 4568, 
            2345234, 234234, 678768, 6456, 787, 46456, 678567, 354345, 23423, 645745, 23423, 
            2435423, 786768, 678786 
        };
            
        int[] playlistB = {
            234823, 678786, 354345, 3094234, 6456, 678567, 23423, 786768, 
            46456, 128732, 6548234, 234234, 4568, 4388934, 23423, 12323, 
            2343947, 2435423, 645745, 678768, 2345234, 90990, 373737, 787
        };

        Arrays.sort(playlistA);
        Arrays.sort(playlistB);

        boolean isTheSame = Arrays.equals(playlistA, playlistB);

        if (isTheSame) {
            System.out.println("This is the same playlist!");
        } else {
            System.out.println("No match was found.");
        }
    }
}
