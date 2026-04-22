// Create two boolean variables, isCatOwner and isDogOwner and give them each a value.
// Write a program that gives the following specials:
// Use the code MEOW for 20% off cat items.
// Use the code WOOF for 20% off dog items.
// If you're neither a cat nor dog pet owner, write a generic “Welcome to the pet store!” message.

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖
        boolean isCatOwner = true;
        boolean isDogOwner = true;

        if (isCatOwner) {
          System.out.println("Use the code MEOW for 20% off cat items.");
        } else if (isDogOwner) {
          System.out.println("Use the code WOOF for 20% off dog items.");
        } else {
          System.out.println("Welcome to the pet store!");
        }
        
    }
}
