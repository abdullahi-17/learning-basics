/* Let's create a ticket automation system so that you can get the list of ingredients for each drink, depending on the order.

Create the boolean variables isLatte, isIced, and withMatcha.
Create the integer variables itemsOrdered and vanillaPumps.
First, create an if/else statement that follows the order below:

If a customer orders an iced latte, print “espresso, milk, ice, syrup.”
Otherwise, If a customer orders a latte with matcha, print “matcha, oat milk, ice, vanilla.”
Otherwise, If a customer orders a latte, print “espresso, steamed milk.”
Otherwise, print “Select a drink to get started!”
Create another if statement with the following condition:

If a customer orders more than 1 item, print “provide cup holder”
Create your last if statement with the following conditions:

If a customer orders 2 or more pumps of vanilla, print “charge $1 extra”. //
*/

public class HelloWorld {
    public static void main(String[] args) {
        boolean isLatte = true;
        boolean isIced = false;
        boolean withMatcha = true;
        int itemsOrdered = 1;
        int vanillaPumps = 3;

        if (isLatte && isIced) {
          System.out.println("espresso,milk,ice,syrup.");
        } else if (isLatte && withMatcha) {
          System.out.println("matcha, oat milk, ice, vanilla.");
        } else if (isLatte) {
          System.out.println("espresso, steamed milk.");
        } else {
          System.out.println("Select a drink to get started!");
        }

        if (itemsOrdered > 1) {
          System.out.println("provide cup holder");
        } else if (vanillaPumps >= 2) {
          System.out.println("charge $1 extra");
        }
    }