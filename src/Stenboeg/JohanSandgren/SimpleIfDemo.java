package Stenboeg.JohanSandgren;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        int number;

        System.out.println("Skriv et helt tal");

        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("HiFive");
        }
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
        if (number % 5 != 0) {
            System.out.println("HiNothing");
        }
    }
}

