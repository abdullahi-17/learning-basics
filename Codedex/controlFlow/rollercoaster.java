// You're at a theme park! To ride, you must be above a certain height and weight. Otherwise, you'll have to wait until next year.
// Create a program that checks if you can ride the rollercoaster if you weigh above 40 kg and are taller than 120 cm.
// If both conditions are met, print “Congrats! You can ride!” 🎢
// Otherwise, “Sorry, You can't ride today.” 😞

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖
        int height = 121;
        int weight = 41;

        if (height > 120 && weight > 40) {
          System.out.println("Congrats! You can ride!");
        } else {
          System.out.println("Sorry, You can't ride today.");
        }
    }
}
