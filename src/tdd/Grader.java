package tdd;

public class Grader {
    public char gradeLetter(int numberGrade) {
        char letter = ' ';
        if (numberGrade > 90){
            letter = 'A';
        } else if (numberGrade > 80) {
            letter = 'B';
        } else if (numberGrade > 70) {
            letter = 'C';
        } else if (numberGrade > 60) {
            letter = 'D';
        } else if (numberGrade >= 50) {
            letter = 'E';
        } else if (numberGrade >= 0) {
            letter = 'F';
        } else {
            throw new IllegalArgumentException("Number grade cannot be bellow 0");

        }

        return letter;
    }
}
