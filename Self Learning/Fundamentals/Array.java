package Fundamentals;

public class Array {
    public static void main(String[] args){

        int[] scores = {85,90,75,88,92};
        System.out.println(scores[0]);
        scores[0] = 15;
        System.out.println(scores[0]);

        String[] names = {"Emad", "Daniel", "Jack"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
