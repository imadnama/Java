package Fundamentals;

public class For {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        for (int i = n - 1; i >= 0; i--){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
