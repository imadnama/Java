package Fundamentals;//class Fundamentals.Random{
//    public static void main(String[] args) {
//        int number = 1 + (int)(Math.random() * 10);
//        System.out.println(number);
//    }
//}

import java.util.Scanner;

class Random{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 1 + (int)(Math.random() * 10);
        int guess = 0;
        while (guess != number){
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            if (guess == number){
                System.out.print("Right");
            }
        }
    }

}