public class StudentsGrades {
    public static void main(String[] args){

        int[] StudentsGrades = {50,70,54,98,72,90,30,85,60,20,97};

        int Passed=0, Failed=0, Count=0;
        double Sum=0;
        int Highest = StudentsGrades[0];
        int Lowest = StudentsGrades[0];
        for (int i: StudentsGrades){

            Count ++;
            Sum += i;

            if (i >= 50) {
                Passed++;
            }
            else{
                Failed++;
            }

            if (i > Highest){
                Highest = i;
            }
            if (i < Lowest){
                Lowest = i;
            }
        }
        System.out.println("Passed: " + Passed + " " + "Failed: " + Failed);
        System.out.println("Highest: " + Highest + " " + "Lowest: " + Lowest);
        System.out.println("Average: " + Sum/Count);
    }
}
