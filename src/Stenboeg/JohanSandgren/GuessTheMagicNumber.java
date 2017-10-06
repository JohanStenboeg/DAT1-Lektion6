package Stenboeg.JohanSandgren;

import java.util.Scanner; //importer scanner classen

public class GuessTheMagicNumber {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 101); //Beder maskinen finde et tal mellem 0 og 101.

        Scanner input = new Scanner(System.in);
/*
        System.out.println("Guess a number between 0 and 100");

        System.out.print("\nEnter your guess: ");

        int guess = input.nextInt();

        if (guess < number) {
            System.out.println("Your guess is too low");
        }
        if (guess > number) {
            System.out.println("Your guess is too high");
        } */
        int guess = -10;

        while (number != guess) {

            System.out.println("Guess a number between 0 and 100");

            System.out.print("\nEnter your guess: ");

                int guesss = input.nextInt();
                guess = guesss;

            if (guess < number) {
                System.out.println("Your guess is too low");
            }
            if (guess > number) {
                System.out.println("Your guess is too high");
            }
        }
        if (guess == number) {
        System.out.println("Your guess is correct, the number is: " + number);
    }
}
}
