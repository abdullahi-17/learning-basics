/* In your HelloWorld.java file, you'll be creating a "Choose your own Adventure Game". You'll come up with your own story-based game for a user to play, with different outcomes based on their choices throughout the story.
Create a program that uses the Scanner for user input, and, depending on what the user selects, you change the output of the story. Use your knowledge of program control flow to create only three (3) distinct endings to your adventure story. */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(""" _  _             _  _
        .       /\\/%\       .   /%\/%\     .
        __.<\\%#//\,_       <%%#/%%\,__  .
        .    <%#/|\\%%%#///\    /^%#%%\///%#\\
        ""/%/""\ \""//|   |/""'/ /\//"//'
        .     L/'`   \ \  `    "   / /  ```
        `      \ \     .   / /       .
        .       .      \ \       / /  .
        .        \ \     / /          .
        .      .    ..:\ \:::/ /:.     .     .
        ______________/ \__;\___/\;_/\________________________________
        wYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYw""");
        
        char house = scanner.nextChar();
        System.out.println("You have been transported to the year 3433. You wake up and notice that you're no longer on Earth. Gravity feels different. It's dark outside and as you stand up, you realize you're outside... a house?");
        System.out.println("Select one: [a] Walk towards the house or [b] call out to the house");

        if (house == "a") {
            char approachHouse = scanner.nextLine();
            System.out.println("You approach the house and walk up the stairs to the front door. You're about to knock when suddenly you notice the lights inside the house turn on.");
            System.out.println("Select one: [a] Knock on the door [b] turn around and run");

            if (approachHouse == "a") {
                char knockDoor = scanner.nextLine();
                System.out.println("The computer says you live on!");
                System.out.println("You knock on the door and you're offered berries.");
                System.out.println("Select one: [a] Eat the berries or [b] Turn around and run");
               
                if (knockDoor == "a") {
                    System.out.println("You ate some berries and didn't die. Peeta is that you? Press [y] to play again.");
                } else if (knockDoor == "b") {
                    System.out.println("You fell off the cliff and plummeted to your death. Sorry... Press [y] to restart.!");
                } else {
                    System.out.println("That is an invalid option, please select option [a] or option[b]");
                }

            } else if (approachHouse == "b") {
                System.out.println("You fell off the cliff and plummeted to your death. Sorry... Press [y] to restart.!");
            } else {
                System.out.println("That is an invalid option, please select option [a] or option[b]");
            }
            
        } else if (house == "b") {
            char callHouse = scanner.nextChar();
            System.out.println("You call out to the house and you hear someone call back.");
            System.out.println("Select one: [a] Walk towards the house or [b] Turn around and run");

            if (callHouse == "a") {
                System.out.println("You knock on the door and someone answers. Congrats! You made a new friend!");
            } else if (callHouse == "b") {
                System.out.println("You fell off the cliff and plummeted to your death. Sorry... Press [y] to restart.!");
            } else {
                System.out.println("That is an invalid option, please select option [a] or option[b]");
            }
            
        } else {
            System.out.println("That is an invalid option, please select option [a] or option[b]");
        }



    


}