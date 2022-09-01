package dietel.Chapter8.Excersises;

import dietel.Chapter6.StudentRecord;

class StudentRecordTest {
    public static void main(String[] args) {
        int[][] scoresArray = {{87, 96, 70}, {68,87,90}, {94,100,90}};

        StudentRecord studentRecord = new StudentRecord("Subject", scoresArray);

        System.out.printf("Exams total for subjects  %n%s%n%n", StudentRecord.getSubject());

        studentRecord.processScores();
    }


}