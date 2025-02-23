package Fundamentals;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        Scanner PersonInformation = new Scanner(System.in);

        System.out.print("name: ");
        String name = PersonInformation.nextLine();

        System.out.print("age: ");
        int age = PersonInformation.nextInt();

        System.out.print("id: ");
        long id = PersonInformation.nextLong();

        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your id " + id);

        PersonInformation.close();
    }
}
