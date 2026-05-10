/* You're stuck in a murder mystery, and you need to figure out the password to hack into an email account containing suspicious mail! 🕵️
You find a text file called password.txt with the following gibberish written inside:
Create a string array with the six strings in the text file (even if there are numbers!)
Sort the array using the .sort().
Add only the first three elements to a completely new string array called sortedPasswords, and use them to form a secret passphrase by concatenating them together by iterating through the new array! 
Concatenate the elements into a single string called a passphrase, and print out the result. (This will be your email password!) */

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖
        String[] passkeys = {"ASDFDFA", "34958234985234820934", "243082304920394", "ASDFAFMMMMMMMMM99999999", "12212112", "23094230482"};

        Arrays.sort(passkeys);
        String[] sortedPasswords = new String[3];

        for (int i = 0; i < 3; i++) {
            sortedPasswords[i] = passkeys[i];
            System.out.println(sortedPasswords[i]);
        }

        String passphrase = sortedPasswords[0] + sortedPasswords[1] + sortedPasswords[2];
        System.out.println(passphrase);

    }
}

