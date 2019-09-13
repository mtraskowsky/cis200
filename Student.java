// MODEL
/**
* <Student.java>
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This class contains methods which do the calculations and logic of the program. The
* weight percentages of each category is held here a private constant. Methods in this class
* include those for calculating adjusted possible points, adjusted earned points, and overall
* percentage score. The toString() method here will display (when called from the controller
* class) each student's first and last name, their wilcat ID, and their overall percentage score
* and final grade.  
*/


import java.text.DecimalFormat;
import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private String wildcatID;
    private double labTotalScore;
    private double projectTotalScore;
    private double examTotalScore;
    private double zybookTotalScore;
    private double finalExamScore;
    private double overallPercentScore;

    public double totalPointsPossible;
    public double totalPointsEarned;
    public double totalAdjustedPointsEarned;

    private final double labWeight = .15;
    private final double projectWeight = .15;
    private final double examsWeight = .30;
    private final double zybookWeight = .10;
    private final double finalExamWeight = .30;

    public char finalGrade = '6';

    /* default no argument constructor
    1. Create a student object with default values:
    first/last name = "no name entered"
    wildcatID = "no WID"
    all numeric values explicitly to zero
    */

    /** Student
    * No argument constructor that initializes Student object to default values *
    */
    public Student() {
        firstName = "no name entered";
        lastName = "no name entered";
        wildcatID = "no WID";
        labTotalScore = 0;
        projectTotalScore = 0;
        examTotalScore = 0;
        zybookTotalScore = 0;
        finalExamScore = 0;
        overallPercentScore = 0;
    }



   /** Student
    * 8-argument constructor that initializes to values passed in for first name, last *
    * @param firstN student first name
    * @param lastN student last name
    * @param WID student wildcat ID
    * @param lab student lab score
    * @param projects student project score
    * @param exams student exmas score
    * @param zybook student zybook score
    * @param finalExam student final exam score
    */
    public Student(String firstN, String lastN, String WID, double lab, double projects, double exams, double zybook, double finalExam) {
        firstName = firstN;
        lastN = lastName = lastN;
        wildcatID = WID;
        labTotalScore = lab;
        projectTotalScore = projects;
        examTotalScore = exams;
        zybookTotalScore = zybook;
        finalExamScore = finalExam;
    }

// -----------------  POSSIBLE POINTS -----------------------
    // TOTAL POSSIBLE POINTS
    /** totalPointsPossible
    * Sums up all possible points *
    * @param l lab possible points
    * @param p project possible points
    * @param e exams possible points
    * @param z zybook possible points
    * @param f final exam possible points
    * @return total points possible
    */
    public double totalPointsPossible(double l, double p, double e, double z, double f) {
        totalPointsPossible = l + p + e + z + f;
        return totalPointsPossible;
    }
    // LAB POSSIBLE POINTS
    /** labPossibleAdjustedPoints
    * Calculates lab possible points, adjusted by lab weight *
    * @param totalPointsPossible total points possible 
    * @return lab possible points, adjusted by lab weight
    */
    public double labPossibleAdjustedPoints(double totalPointsPossible) {
        double labPossibleAdjustedPts = totalPointsPossible * labWeight;
        return labPossibleAdjustedPts;
    }
    // PROJECT POSSIBLE POINTS
    /** projectPossibleAdjustedPoints
    * Calculates project possible points, adjusted by lab weight *
    * @param totalPointsPossible total points possible 
    * @return project possible points, adjusted by lab weight
    */
    public double projectPossibleAdjustedPoints(double totalPointsPossible) {
        double projPossibleAdjustedPts = totalPointsPossible * projectWeight;
        return projPossibleAdjustedPts;
    }
    // EXAMS POSSIBLE POINTS
    /** examPossibleAdjustedPoints
    * Calculates exam possible points, adjusted by lab weight *
    * @param totalPointsPossible total points possible 
    * @return exam possible points, adjusted by lab weight
    */
    public double examPossibleAdjustedPoints(double totalPointsPossible) {
        double examPossibleAdjustedPts = totalPointsPossible * examsWeight;
        return examPossibleAdjustedPts;
    }
    // ZYBOOK POSSIBLE POINTS
    /** zybookPossibleAdjustedPoints
    * Calculates zybook possible points, adjusted by lab weight *
    * @param totalPointsPossible total points possible 
    * @return zybook possible points, adjusted by lab weight
    */
    public double zybookPossibleAdjustedPoints(double totalPointsPossible) {
        double zybookPossibleAdjustedPts = totalPointsPossible * zybookWeight;
        return zybookPossibleAdjustedPts;
    }
    // FINAL EXAM POSSIBLE POINTS
    /** finalExamPossibleAdjustedPoints
    * Calculates final exam possible points, adjusted by lab weight *
    * @param totalPointsPossible total points possible 
    * @return final exam possible points, adjusted by lab weight
    */
    public double finalExamPossibleAdjustedPoints(double totalPointsPossible) {
        double finalExamPossibleAdjustedPts = totalPointsPossible * finalExamWeight;
        return finalExamPossibleAdjustedPts;
    }

// -----------------  EARNED POINTS -----------------------
    // TOTAL EARNED POINTS
    /** totalPointsEarned
    * Sums up all earned points *
    * @param l lab earned points
    * @param p project earned points
    * @param e exams earned points
    * @param z zybook earned points
    * @param f final exam earned points
    * @return total points earned
    */
    public double totalPointsEarned(double l, double p, double e, double z, double f) {
        totalPointsEarned = l + p + e + z + f;
        return totalPointsEarned;
    }
    // LAB EARNED POINTS
    /** labEarnedAdjustedPoints
    * Calculates lab earned adjusted points *
    * @param labEarned lab earned points 
    * @param labPossible lab points possible
    * @param labAdjustedPts lab points possible, adjusted 
    * @return lab total score
    */
    public double labEarnedAdjustedPoints(double labEarned, double labPossible, double labAdjustedPts) {
        labTotalScore = (labEarned /  labPossible) * labAdjustedPts;
        return labTotalScore;
    }
    // PROJECT EARNED POINTS
    /** projEarnedAdjustedPoints
    * Calculates project earned adjusted points *
    * @param projEarned project earned points 
    * @param projPossible project points possible
    * @param projAdjustedPts project points possible, adjusted 
    * @return project total score
    */
    public double projEarnedAdjustedPoints(double projEarned, double projPossible, double projAdjustedPts) {
        projectTotalScore = (projEarned /  projPossible) * projAdjustedPts;
        return projectTotalScore;
    }
    // EXAMS EARNED POINTS
    /** examsEarnedAdjustedPoints
    * Calculates exam earned adjusted points *
    * @param examsEarned exam earned points 
    * @param examsPossible exam points possible
    * @param examsAdjustedPts exam points possible, adjusted 
    * @return exam total score
    */
    public double examsEarnedAdjustedPoints(double examsEarned, double examsPossible, double examsAdjustedPts) {
        examTotalScore = (examsEarned / examsPossible) * examsAdjustedPts;
        return examTotalScore;
    }
    // ZYBOOKS EARNED POINTS
    /** zybookEarnedAdjustedPoints
    * Calculates zybook earned adjusted points *
    * @param zybooksEarned zybook earned points 
    * @param zybookPossible zybook points possible
    * @param zybookAdjustedPts zybook points possible, adjusted 
    * @return zybook total score
    */
    public double zybookEarnedAdjustedPoints(double zybooksEarned, double zybookPossible, double zybookAdjustedPts) {
        zybookTotalScore = (zybooksEarned / zybookPossible) * zybookAdjustedPts;
        return zybookTotalScore;
    }
    // FIMNAL EXAM EARNED POINTS
    /** finalExamEarnedAdjustedPoints
    * Calculates final exam earned adjusted points *
    * @param zybooksEarned final exam earned points 
    * @param zybookPossible final exam points possible
    * @param zybookAdjustedPts final exam points possible, adjusted 
    * @return final exam total score
    */
    public double finalExamEarnedAdjustedPoints(double finalExamEarned, double finalExamPossible, double finalExamAdjustedPts) {
        finalExamScore = (finalExamEarned / finalExamPossible) * finalExamAdjustedPts;
        return finalExamScore;
    }
    // SUM OF ADJUSTED EARNED POINTS
    /** sumAdjustedPointsEarned
    * Calculates total earned adjusted points *
    * @param labPointsEarned lab earned points 
    * @param projPointsEarned project earned points
    * @param examsPointsEarned exam points earned
    * @param zybooksPointsEarned zybook points earned  
    * @param finalExamPointsEarned final exam points earned 
    * @return total adjusted points earned
    */
    public double sumAdjustedPointsEarned(double labPointsEarned, double projPointsEarned, double examsPointsEarned, double zybooksPointsEarned, double finalExamPointsEarned){
        totalAdjustedPointsEarned = (labPointsEarned + projPointsEarned + examsPointsEarned + zybooksPointsEarned + finalExamPointsEarned);
        return totalAdjustedPointsEarned;
    }
 
    // OVERALL PERCENT SCORE
    /** calcOverAllPercentScore
    * Calculates overall percent score *
    */
    private void calcOverAllPercentScore() {
    overallPercentScore = (totalAdjustedPointsEarned / totalPointsPossible) * 100;
    }
    /** getOverallPercent
    * Returns overall percent score *
    * @return overall percent score
    */
    public double getOverallPercent() {
        calcOverAllPercentScore();
        return overallPercentScore;
    }
    /** finalGrade
    * Returns final grade as a char *
    * @return final grade
    */
    public char finalGrade() {
        double percent = getOverallPercent();
        if (percent >= 89.5){
            finalGrade = 'A';
        }
        else if (percent >= 79.5){
            finalGrade = 'B';
        }
        else if (percent >= 68.5){
            finalGrade = 'C';
        }
        else if (percent > 58.5){
            finalGrade = 'D';
        }
        else if(percent <= 58.5){
            finalGrade = 'F';
        }
        return finalGrade;
    }
    /** setFirstName
    * Sets student first name *
    * @param firstN student first name
    */
    public void setFirstName(String firstN) {
        firstName = firstN;
    }
    /** getFirstName
    * Returns student first name *
    * @return student first name
    */
    public String getFirstName() {
        return firstName;
    }
    /** setLastName
    * Sets student last name *
    * @param lastN student last name
    */
    public void setLastName(String lastN) {
        lastName = lastN;
    }
    /** getLastName
    * Returns student last name *
    * @return student last name
    */
    public String getLastName() {
        return lastName;
    }
    /** setWildcatID
    * Sets student wildcat ID *
    * @param wID student wildcat ID
    */
    public void setWildcatID(String wID) {
        wildcatID = wID;
    }
    /** getWildcatID
    * Returns student wildcat ID *
    * @return student wildcat ID
    */
    public String getWildcatID() {
        return wildcatID;
    }
    /** toString
    * Returns string with student first and last name, wildcat ID, overall percent score, 
    and final grade
    * @return string with student info
    */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat ("#,###,###.0%");

        char finalG = finalGrade();
        double overallPerc = getOverallPercent();
        sb.append("\nStudent Name: " + lastName + ", " + firstName);
        sb.append("\nWID: " + wildcatID);
        sb.append("\nOverall Percentage: " + df.format(overallPerc / 100));
        sb.append("\nFinal Grade: " + finalG);
        sb.append("\n");

        return sb.toString();
    } // end toString()
    
}