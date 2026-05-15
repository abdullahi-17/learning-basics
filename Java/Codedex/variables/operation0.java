/* You're a scientist at a lab mixing chemicals. We have the formula that we need to cause a chemical reaction:
reactionResult= AB/(A+B)
What is the result of the reaction? Create chemicalA and chemicalB variables, each holding a random amount of grams.
*/

public class HelloWorld {
    public static void main(String[] args) {
        double chemicalA = 10;
        double chemicalB = 20;
        double reactionResult = (chemicalA + chemicalB) / (chemicalA * chemicalB);
        
        System.out.println(reactionResult);
    }
}
