// CONTROLLER
/**
* <StudentApp.java>
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This class (the controller) contains a main method in which a view object is created, and
* a student object is created. Using these objects, methods from the View class and Student
* classes are called. The function of this project is to calculate the grade of a student based
* on points and weight averages for each category. This class, using methods from the Student
* and View classes, calculates and displays the points. This class also creates an array that 
* contains a maximum of 20 students, and will display each student's name and scores if the
* user chooses to do so.
*/


public class StudentApp {
    /** main
    * Main method of student app class
    */
    public static void main(String[] args){

    // create an IO object
    View v = new View();
    
    // create a model object
    Student [] s = new Student[20];

        // POINTS POSSIBLE
        double labPossible = v.getPossiblePointsLab();
        double projPossible = v.getPossiblePointsProjects();
        double examsPossible = v.getPossiblePointsExams();
        double zybookPossible = v.getPossiblePointsZybooks();
        double finalExamPossible = v.getPossiblePointsFinalExam();
    
    for (int i = 0; i < 20; i++) {
        s[i] = new Student();

        // TOTAL POINTS POSSIBLE
        double totalPointsPossible = s[i].totalPointsPossible(labPossible, projPossible, examsPossible, zybookPossible, finalExamPossible); 
    
        // ADJUSTED POINTS
        double labAdjustedPts = s[i].labPossibleAdjustedPoints(totalPointsPossible);
        double projAdjustedPts = s[i].projectPossibleAdjustedPoints(totalPointsPossible);
        double examsAdjustedPts = s[i].examPossibleAdjustedPoints(totalPointsPossible);
        double zybookAdjustedPts = s[i].zybookPossibleAdjustedPoints(totalPointsPossible);
        double finalExamAdjustedPts = s[i].finalExamPossibleAdjustedPoints(totalPointsPossible);
    
        s[i].setFirstName(v.promptFirstName());
        s[i].setLastName(v.promptLastName());
        s[i].setWildcatID(v.promptWildcatID());

        double labEarned = v.getTotalScoreLab();
        double projEarned = v.getTotalScoreProject();
        double examsEarned = v.getTotalScoreExam();
        double zybooksEarned = v.getTotalScoreZybook();
        double finalExamEarned = v.getTotalScoreFinalExam();

        // TOTAL POINTS EARNED
        double totalPointsEarned = s[i].totalPointsEarned(labEarned, projEarned, examsEarned, zybooksEarned, finalExamEarned);
        
        // TOTAL POINTS EARNED EACH CATEOGORY, ADJUSTED BY WEIGHT %
        double labPointsEarned = s[i].labEarnedAdjustedPoints(labEarned, labPossible, labAdjustedPts);
        double projPointsEarned = s[i].projEarnedAdjustedPoints(projEarned, projPossible, projAdjustedPts);
        double examsPointsEarned = s[i].examsEarnedAdjustedPoints(examsEarned, examsPossible, examsAdjustedPts);
        double zybooksPointsEarned = s[i].zybookEarnedAdjustedPoints(zybooksEarned, zybookPossible, zybookAdjustedPts);
        double finalExamPointsEarned = s[i].finalExamEarnedAdjustedPoints(finalExamEarned, finalExamPossible, finalExamAdjustedPts);

        
        // TOTAL POINTS EARNED
        double sumAdjustedPointsEarned = s[i].sumAdjustedPointsEarned(labPointsEarned, projPointsEarned, examsPointsEarned, zybooksPointsEarned, finalExamPointsEarned);
        v.numStudentsEntered(i + 1);
        boolean addAnotherStudent = v.addAnotherStudent();
        if (addAnotherStudent == false) {
            break;
            //i = 21; // end for loop
        } // end if
    } // end for loop for number of students

    for (int j = 0; j < 20; j++) {
        if (s[j] == null) {
            break;
        } // end if 
        v.displayStudent(s[j]); // displays one student
        boolean printAnother = v.printAnotherStudent(); // asks user to press enter if they want to print another student
        if (printAnother == false) {
            break;
        }
    }
    v.allStudentsDisplayed();

    } // end main
} // end StudentApp class