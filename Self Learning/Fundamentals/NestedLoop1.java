package Fundamentals;

public class NestedLoop1 {
    public static void main(String[] args) {
        int numweeks = 3;
        int daysPerWeek = 7;

        for (int week = 1; week <= numweeks; week++){
            System.out.println("Week: " + week);
            for (int day = 1; day <= daysPerWeek; day++){
                System.out.println(" Day: " + day);
            }
        }
    }
}
