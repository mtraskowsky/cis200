/*
* Lab4.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* In Part 1 of this program, a single dimensional array is created to store exam scores
* which are user inputs. Using for loops, the high score, low score, and average score 
* of each student is found and displayed. 
*
* In Part 2 of this program, we assume that the student whose exam scores that we 
* calculated in Part 1 is part of an entire class. A 2D array is created to store the 
* number of students in the class and number of exams given (both user inputs). In the 2D
* array, the number of rows = the number of students in the class, and the number of columns 
* = number of exams given. For each student, exam scores are read in and student averages
* are calculated and displayed, as well as the class average.
*/

import java.util.*;

public class Lab4 {
	public static void main(String[] args) {

       Scanner scnr = new Scanner(System.in);
        
        int numExams;
        int i;
        int j;
        int examInput;
        double averageExamScore;
        int numStudents;
        int numExamsGiven;
        double examAveragePerStudent;
        int examTotalPointsPerStudent = 0;
        int totalPointsForWholeClass = 0;
        double classAverage;

    // FOR PART 2
        System.out.println("How many students are in the class? ");
        numStudents = Integer.parseInt(scnr.nextLine());

        System.out.println("How many exams were there per student? ");
        numExamsGiven = Integer.parseInt(scnr.nextLine());

        // 2D array
        int [] [] allStudents = new int [numStudents] [numExamsGiven];

        // for loop to read in each students exam score
        for (i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1));

            examAveragePerStudent = 0;
            examTotalPointsPerStudent = 0;
            for (int exam = 0; exam < numExamsGiven; exam++) {
            System.out.println("Enter test " + (exam + 1) + " grade (0 to 100): ");
            allStudents [i] [exam]  = Integer.parseInt(scnr.nextLine());
            examTotalPointsPerStudent += allStudents [i] [exam];
            } 
            // calculate student average
            examAveragePerStudent = (double)examTotalPointsPerStudent / (double)numExamsGiven;
            System.out.printf("Student average is: %.1f",(double)examAveragePerStudent);
            System.out.println();

            totalPointsForWholeClass += examTotalPointsPerStudent; 
        } // end for loop for numStudents

        classAverage = totalPointsForWholeClass / (double)(numStudents * numExamsGiven);
        System.out.printf("\nThe class average is: %.1f", classAverage);
        System.out.println();
/*    
    // FOR PART ONE
        System.out.println("Number of exams taken by the student: ");
        numExams = scnr.nextInt();
        int [] examScores = new int[numExams];
        
        // ask user to input exam scores and store in examScores array
        System.out.println("Please enter in the exam scores for the student.");
        
        // for loop which assigns each exam score to an index in the examScores array
        for (i = 0; i < numExams; i++) {
            examScores[i] = scnr.nextInt();
        } 
        // loops through examscores and determines high score
            int highestExamScore = 0;
            for (j = 0; j < examScores.length; j++) {
                if (examScores[j] > highestExamScore){
                    highestExamScore = examScores[j];
                } // end if
               
            } // end 'j' for loop

            System.out.println("The highest exam score is: " + highestExamScore);

            // find lowest score
             int lowestExamScore = 100;
            for (j = 0; j < examScores.length; j++) {
                if (examScores[j] < lowestExamScore){
                    lowestExamScore = examScores[j];
                } // end if
                
            } // end 'j' for loop
            
            System.out.println("The lowest exam score is: " + lowestExamScore);

            // find average score
            double sumExamScores = 0;
            for (i = 0; i < numExams; i++) {
                sumExamScores += examScores[i];
            }
            averageExamScore = sumExamScores / numExams;
            System.out.println("Average exam score is: " + averageExamScore);

            */


    } // end main
} // end class
