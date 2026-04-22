// 1 coin in Club Penguin is equal to $0.0045 USD.
// Create a program that serves as a conversion calculator, where a penguin can enter the number of coins they have, and it will return how much money they have in USD!

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double clubCoins = 0.0045;
        int coins = scanner.nextInt();
        System.out.println("How Many Coins do you Have?: ");
        double dollars = clubCoins * coins;
        System.out.println(dollars);
        
    }
}
