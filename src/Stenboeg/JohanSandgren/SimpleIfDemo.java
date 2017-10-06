package Stenboeg.JohanSandgren; //Min package, så koden ikke kører i andre packages.

import java.util.Scanner; //Da der skal bruges scanner object, så importeres det.

public class SimpleIfDemo {
    public static void main(String[] args) {
        int number; //Deklarerer variablen

        System.out.println("Skriv et helt tal"); //Udprinter hvad man skal indtaste.

        Scanner input = new Scanner(System.in); //Deklarerer nyt input til scanneren.

        number = input.nextInt(); //Initialisere at number får sin værdi fra scanner inputtet.

        if (number != 0){
        if (number % 5 == 0) {
            System.out.println("HiFive"); //Laver en if-sætning, som hvis tallet kan deles med 5 skriver Hifive.
        }
        if (number % 2 == 0) {
            System.out.println("HiEven"); //Laver en if-sætning, som hvis tallet kan deles med 2, skriver HiEven.
        }
        if ((number % 5 != 0) && (number % 2 != 0)){
            System.out.println("HiNothing"); //Hvis tallet fra scanneren ikke kan deles med hverken 5 eller 2, printer den HiNothing.
        }
        }
        if (number == 0){
            System.out.println("HiNothing)");
        }
    }
}

