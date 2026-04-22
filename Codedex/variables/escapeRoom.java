// We have the following escape room clue we need to solve!
// I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?
// Use the scanner to create a program that asks the user for their answer to the riddle. At the end, be sure to test it, and end the program with a congratulations phrase!

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
    String riddle = "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind.";
    System.out.println(riddle);
    Scanner scanner = new Scanner(System.in);
    System.out.println("What am I?: " );
    String answer = scanner.nextLine();
    System.out.println("Congratulations!");
        
    }
}
