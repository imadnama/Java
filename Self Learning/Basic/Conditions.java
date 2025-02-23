package Basic;

public class Conditions {
    public static void main(String[] args) {
        byte score = 85;
        String grade = getGrade(score);
        System.out.println("Your grade is: " + grade);
    }

    public static String getGrade(byte score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
