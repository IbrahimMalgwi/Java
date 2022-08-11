package dietel.Chapter6;

public class StudentRecord {
    private static String subject;
    private int[][] scores;

    public StudentRecord(String subject, int[][] scores){
        this.subject = subject;
        this.scores = scores;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public static String getSubject(){
        return subject;
    }

    public void processScores(){
        outputScores();

        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest score in the exams is", getMinimum(),
                "Highest score in the exams is", getMaximum());
//        outputBarChart();
    }

    public int getMinimum() {
        int lowScore = scores[0][0];

        for (int[] studentScores : scores) {
            for (int score : studentScores) {
                if (score < lowScore)
                    lowScore = score;
            }
        }
        return lowScore;
    }

    public int getMaximum(){
        int highScore = scores[0][0];

        for (int[] studentScores : scores){
            for (int score : studentScores) {
                if (score > highScore)
                    highScore = score;
            }
        }
        return highScore;
    }

    public double getAverage (int[] setOfScores){
        int total = 0;

        for (int score : setOfScores)
            total += score;
        return (double) total / setOfScores.length;
    }

//    public void outputBarChart(){
//        System.out.println("Overall scores distribution:");
//
//        int[] frequency = new int[11];
//
//        for (int[] studentScore : scores){
//            for (int score : studentScore)
//                ++frequency[score/10];
//        }
//        for (int count = 0; count < frequency.length; count++) {
//            if (count == 10)
//                System.out.printf("%5d: ", 100);
//            else
//                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
//            for (int star = 0; star < frequency[count]; star++)
//                System.out.print("*");
//
//            System.out.println();
//        }
//    }

    public void outputScores(){
        System.out.printf("The scores are:%n%n");
        System.out.print("              ");
        for (int sub = 0; sub< scores[0].length; sub++)
            System.out.printf("Subj %d ", sub + 1);
        System.out.println("Average");

        for (int student = 0; student < scores.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int sub : scores[student])
                System.out.printf("%8d", sub);

            double average = getAverage(scores[student]);

            System.out.printf("%9.2f%n", average);
        }
    }

}
