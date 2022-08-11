package Excersises;
import java.util.*;

public class SchoolRecord {
    public static void main(String[] args) {
        takingStudentDetails();

    }
    private static final Scanner input = new Scanner(System.in);

    private static int index;

    static double subjectTotal = 0;
    private static int failureCount = 0;
    private static int passCount = 0;
    private static int subTotal = 0;
    private static int subAverage = 0;
    private static double total = 0;

    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<Integer> englishGrade = new ArrayList<>();
    static ArrayList<Integer> mathsGrade = new ArrayList<>();
    static ArrayList<Integer> physicsGrade = new ArrayList<>();

    public static int getScore() {return input.nextInt();}

    public static void takingStudentDetails(){
        System.out.println("How many students do you have: ");
        int name_length = input.nextInt();

        System.out.println("How many subjects do they take: ");
        int subject_length = input.nextInt();

        for (int index = 0; index < name_length; index++){
            System.out.printf("%s%n", "Enter student name");
            String studentName = input.nextLine();
            name.add(studentName);
        }

        for (index = 0; index < subject_length; index++){
            System.out.printf("%s%n", "Enter grade for English");
            englishGrade.add(getScore());

            System.out.printf("%s%n", "Enter grade for Mathematics");
            mathsGrade.add(getScore());

            System.out.printf("%s%n", "Enter grade for Physics");
            physicsGrade.add(getScore());
        }
        resultPage();
    }

    private static void resultPage() {
        System.out.printf("===========================================================================================================%n");
        System.out.printf("%s %20s %18s %22s %17s %17s %n", "STUDENT", "ENGLISH", "MATHEMATICS", "PHYSICS", "TOTAL", "AVERAGE", "POSITION");
        System.out.printf("===========================================================================================================%n");

        for (index = 0; index < name.size(); index++){
            subjectTotal = englishGrade.get(index) + mathsGrade.get(index) + physicsGrade.get(index);

            double average = subjectTotal / englishGrade.size();

            System.out.printf("%s %20d 12d% %12d %18.2f %18.2f%n", name.get(index), englishGrade.get(index), physicsGrade.get(index), subjectTotal, average);
            total = subjectTotal + total;
        }
    }

    public static void subjectSummary() {
        System.out.println("SUBJECT SUMMARY");
        englishSumamry();

        mathSummary();

        physicsSummary();
    }

    public static void englishSumamry() {
        System.out.println("ENGLISH");
        for (index = 0; index < englishGrade.size(); index++){
            subTotal = englishGrade.get(index) + subTotal;
            subAverage = subTotal / englishGrade.size();

            if (englishGrade.get(index) >= 50){
                passCount++;
            } else {
                failureCount++;
            }
        }
        System.out.println("The Total Score is: " + subjectTotal);
        System.out.println("The Average Score is: " + subAverage);
        System.out.println("The Number of Passes is: "+ passCount);
        System.out.println("The Number of Failures is: " + failureCount);
    }

    public static void mathSummary(){
        System.out.println("MATHS");
        for (index = 0; index < mathsGrade.size(); index++){
            subTotal = mathsGrade.get(index) + subTotal;
            subAverage = subTotal / mathsGrade.size();

            if (mathsGrade.get(index) >= 50){
                passCount++;
            } else {
                failureCount++;
            }
        }
        System.out.println("The Total Score is: " + subjectTotal);
        System.out.println("The Average Score is: " + subAverage);
        System.out.println("The Number of Passes is: "+ passCount);
        System.out.println("The Number of Failures is: " + failureCount);
    }

    public static void physicsSummary(){
        System.out.println("PHYSICS");
        for (index = 0; index < physicsGrade.size(); index++){
            subTotal = physicsGrade.get(index) + subTotal;
            subAverage = subTotal / physicsGrade.size();

            if (physicsGrade.get(index) >= 50){
                passCount++;
            } else {
                failureCount++;
            }
        }
        System.out.println("The Total Score is: " + subjectTotal);
        System.out.println("The Average Score is: " + subAverage);
        System.out.println("The Number of Passes is: "+ passCount);
        System.out.println("The Number of Failures is: " + failureCount);
    }

    public static void classSummary(){
        System.out.println("CLASS SUMMARY");
//        System.out.printf("The Best Student is: %s Scoring %.2f%n", "High", bestGraduatingStudent());
//        System.out.printf("The worst Student is: %s Scoring %.2f%n", "Low", worstGraduatingStudent());
        System.out.printf("The class total score is: %.2f%n", total);
        System.out.printf("Class Average is %.2f%n", total / name.size());
    }

    public static void worstGraduatingStudent(){
        int minimumResult = 1000;
        int minimumTotal;

        for (index = 0; index < englishGrade.size(); index++){
            minimumTotal = englishGrade.get(index) + mathsGrade.get(index) + physicsGrade.get(index);

            if (minimumResult > minimumResult) {
                minimumResult = minimumTotal;
            }
        }
//        return minimumResult;
    }

    public static void bestGraduatingStudent(){
        int maximumResult = 0;
        int maximumTotal;

        for (index = 0; index < englishGrade.size(); index++){
            maximumTotal = englishGrade.get(index) + mathsGrade.get(index) + physicsGrade.get(index);

            if (maximumTotal > maximumResult) {
                maximumResult = maximumTotal;
            }
        }
//        return maximumResult;
    }

    public static void hardestSubject(){

    }



}
