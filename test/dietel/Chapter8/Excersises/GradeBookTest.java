package dietel.Chapter8.Excersises;

import africa.semicolon.dietel.Chapter6.GradeBook;

class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to java Programming", gradesArray);

        System.out.printf("Welcome to the grade book for %n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.outputGrades();
        myGradeBook.processGrade();
    }

}