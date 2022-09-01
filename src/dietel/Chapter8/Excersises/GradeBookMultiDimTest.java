package dietel.Chapter8.Excersises;

import dietel.Chapter6.GradeBookMultiDim;

class GradeBookMultiDimTest {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70}, {68,87,90}, {94,100,90}, {100, 81, 82},
                {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84},
                {87, 93, 73}};

        GradeBookMultiDim myGradeBookMulti = new GradeBookMultiDim("CS101 In" +
                "troduction to Java programing", gradesArray);

        System.out.printf("Welcometo the grade book for %n%s%n%n", myGradeBookMulti.getCourseName());

        myGradeBookMulti.processGrade();
    }

}