/* A programmer has created these error logs to help us out. Let's add some comments to describe them for a new programmer who might not know what these mean.
Use the following to help you add comments on the editor to the right. 👉
"Connecting to server…”: The program attempts to establish a connection to a server.
"Error: Connection timed out.": The attempt to connect to the server failed because the connection took too long.
"Retrying…”: The program is going to restart.
*/

public class HelloWorld {
    public static void main(String[] args) {
        System.err.println("Connecting to server…");
        System.err.println("Error: Connection timed out."); 
        System.err.println("Retrying…"); 
    }
}
