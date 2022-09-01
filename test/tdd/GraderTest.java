package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
     Grader grade;

     @BeforeEach
    public void setUp(){
         grade = new Grader();
     }

     @Test
    public void gradeScore90AndAboveShouldReturnATest(){
//         Given that I have a grading method
//         WHen student score 90 and above
//         Check that grade is A
         grade.gradeLetter(92);
         assertEquals('A', grade.gradeLetter(92));
     }

    @Test
    public void gradeScore90AndAboveShouldReturnAFailTest(){
        grade.gradeLetter(80);
        assertNotEquals('A', grade.gradeLetter(80));
    }

     @Test
    public void gradeScore80To89ShouldReturnBTest(){
//         Given that I have a grading Method
//         When student score between 80 - 89
//         Check that grade is B
         grade.gradeLetter(81);
         assertEquals('B', grade.gradeLetter(81));
     }

    @Test
    public void gradeScore80To89ShouldReturnBShouldFailTest(){
        grade.gradeLetter(76);
        assertNotEquals('B', grade.gradeLetter(76));
    }

     @Test
    public void gradeScore70To79ShouldReturnCTest(){
//         Given that IO have grading method
//         When student score between 70 - 79
//         Check that grade is C
         grade.gradeLetter(77);
         assertEquals('C', grade.gradeLetter(77));
     }

    @Test
    public void gradeScore70To79ShouldReturnCFailTest(){
        grade.gradeLetter(66);
        assertNotEquals('C', grade.gradeLetter(66));
    }

     @Test
    public void gradeScore60To69ShouldReturnDTest(){
//         Given that I have a grading system
//         When student score between 60 - 69
//         Check that grade is D
         grade.gradeLetter(66);
         assertEquals('D', grade.gradeLetter(66));
     }

    @Test
    public void gradeScore60To69ShouldReturnDFailTest(){
        grade.gradeLetter(55);
        assertNotEquals('D', grade.gradeLetter(55));
    }

     @Test
    public void gradeScore50To59ShouldReturnETest(){
//         Given that I have  a grading method
//         When a student score between 50 - 59
//         Check that grade is E
         grade.gradeLetter(55);
         assertEquals('E', grade.gradeLetter(55));
     }

    @Test
    public void gradeScore50To59ShouldReturnEFailTest(){
        grade.gradeLetter(44);
        assertNotEquals('E', grade.gradeLetter(44));
    }

     @Test
    public void gradeScoreBelow50ReturnFTest(){
//         Given that I have a grading meethod
//         When student score below 50
//         Check that grade is F
         grade.gradeLetter(49);
         assertEquals('F', grade.gradeLetter(49));
     }

    @Test
    public void gradeScoreBelow50ReturnFFailTest(){
        grade.gradeLetter(55);
        assertNotEquals('F', grade.gradeLetter(55));
    }

     @Test
    public void gradeScoreBellow0ThrowsException()throws IllegalArgumentException{
//        Given that I have a grading method
//         When a value below 0 is entered
//         Throw an exception
         assertThrows(IllegalArgumentException.class,
                 ()->{
                    grade.gradeLetter(-10);
                });


     }


}