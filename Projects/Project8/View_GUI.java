/**
 * This project allows the user to enter in information for courses and store them in an ArrayList.
 * Information about the course that is stored includes name and number of course, first, last, 
 * and username of the instructor, and title, author and price of the textbook for the course.
 * The user enters in all courses, and is then able to display them one at a time by pressing enter.
 * Error handling for multiple types of errors are implemented. 
 * The user can also remove a course in the arraylist, and then the list is displayed.
 * 
 * @author Maria Traskowsky
 * @version 8
 */ 
import javax.swing.JOptionPane; 

public class View_GUI {

    public View_GUI() {

    }
    /**
     * Gets the course number from the user
     * @return course number
     */
    public String getCourseNum() {
        String courseNum = JOptionPane.showInputDialog("Please enter the course number: ");
        return courseNum;
    }
    /**
     * Gets the course name from the user
     * @return course name
     */
    public String getCourseName() {
        String courseName = JOptionPane.showInputDialog("Please enter the course name: ");
        return courseName;
    }
    /**
     * Gets the instructor first name from the user
     * @return instructor first name
     */
    public String getFirstName() {
        String firstName = JOptionPane.showInputDialog("Please enter the instructor's first name: ");
        return firstName;
    }
    /**
     * Gets the instructor last name from the user
     * @return instructor last name
     */
    public String getLastName() {
        String lastName = JOptionPane.showInputDialog("Please enter the instructor's last name: ");
        return lastName;
    }
    /**
     * Gets the instructor username from the user
     * @return instructor username
     */
    public String getUserName() {
        String userName = JOptionPane.showInputDialog("Please enter the instructor's username: ");
        return userName;
    }
    /**
     * Gets the textbook title from the user
     * @return textbook title
     */
    public String getTitle() {
        String title = JOptionPane.showInputDialog("Please enter the title of the textbook: ");
        return title;
    }
    /**
     * Gets the textbook author from the user
     * @return textbook author
     */
    public String getAuthor() {
        String author = JOptionPane.showInputDialog("Please enter the author of the textbook: ");
        return author;
    }
    /**
     * Gets the textbook price from the user
     * @return textbook price
     */
    public double getPrice() {
        String price = JOptionPane.showInputDialog("Please enter the price of the textbook: ");
        double priceDouble = Double.parseDouble(price);
        return priceDouble;
    }

    // ERRORS
    /**
     * Generates an error if invalid input is entered for course number
     * @return course number error
     */
    public String courseNumError() {
        String courseNumError = JOptionPane.showInputDialog("Course number is required (Please re-enter all information) ");
        return courseNumError;
    }
    /**
     * Generates an error if invalid input is entered for course name
     * @return course name error
     */
    public String courseNameError() {
        String courseNameError = JOptionPane.showInputDialog("Course name is required (Please re-enter all information) ");
        return courseNameError;
    }
    /**
     * Generates an error if invalid input is entered for instructor first name
     * @return instructor first name error
     */
    public String firstNameError() {
        String firstNameError = JOptionPane.showInputDialog("Instructor's first name is required (Please re-enter all information) ");
        return firstNameError;
    }
    /**
     * Generates an error if invalid input is entered for instructor last name
     * @return instructor last name error
     */
    public String lastNameError() {
        String lastNameError = JOptionPane.showInputDialog("Instructor's first name is required (Please re-enter all information) ");
        return lastNameError;
    }
    /**
     * Generates an error if invalid input is entered for instructor username
     * @return instructor username error
     */
    public String userNameError() {
        String userNameError = JOptionPane.showInputDialog("Instructor's first name is required (Please re-enter all information) ");
        return userNameError;
    }
    /**
     * Generates an error if invalid input is entered for textbook title
     * @return textbook title error
     */
    public String titleError() {
        String titleError = JOptionPane.showInputDialog("Instructor's first name is required (Please re-enter all information) ");
        return titleError;
    }
    /**
     * Generates an error if invalid input is entered for textbook author
     * @return textbook author error
     */
    public String authorError() {
        String authorError = JOptionPane.showInputDialog("Instructor's first name is required (Please re-enter all information) ");
        return authorError;
    }
    /**
     * Displays a message saying the course has been added to the array list
     */
    public void courseAdded() {
        JOptionPane.showMessageDialog(null, "Course added to the array list!");
    }
    /**
     * Displays an error message saying no chars allowed for price 
     */
    public void numFormatException() {
        JOptionPane.showMessageDialog(null, "No characters allowed for price of textbook. Please re-enter all information for this course.");
    }
    /**
     * Generates java error message
     * @param e Error message
     */
    public void errorMessage(Exception e) {
        JOptionPane.showMessageDialog(null, e);

    }
    /**
     * Asks user if they want to add another course
     * @return user's answer, Y or N
     */
    public String addAnother() {
        String addAnother = JOptionPane.showInputDialog("\nAdd another course? ('Y' or 'N'): ");
        return addAnother;
    }
    /**
     * Displays all course information entered in by the user
     * @param courseInfo course information
     */
    public void printCourseInfo(String courseInfo) {
        JOptionPane.showMessageDialog(null, courseInfo);
    }
    /**
     * Asks user if they want to display the next course
     * @return the user's answer on whether to display next course or not
     */
    public String displayNextCourse() {
        String printCourse = JOptionPane.showInputDialog("Press enter to display another course:");
        return printCourse;
    }
    /**
     * Displays to user that all courses have been displayed
     */
    public void allCoursesDisplayed() {
        JOptionPane.showMessageDialog(null, "All courses have been displayed!");
    }
    /**
     * Asks user to enter in the course that they want to remove
     * @return the course that the user wants to remove
     */
    public String removeCourse(){
            String removeCourse = JOptionPane.showInputDialog("Enter the number of any course that you would like to remove: ");
            JOptionPane.showMessageDialog(null, "Searching through the list of courses...");
            return removeCourse;
    }
    /**
     * Tells user that the course they want to remove has been found and will be removed
     */
    public void courseRemoveFound(int courseNum, String removeCourse) {
        JOptionPane.showMessageDialog(null, "Course " + courseNum + " matches the course that you want to remove. " + removeCourse + " has been removed from the arraylist of courses.");
    }
    /**
     * Tells user that the course they want to remove has not been found
     */
    public void courseNotFound(int courseNum) {
        JOptionPane.showMessageDialog(null, "Course " + courseNum + " was not a match for the course that you want to remove.");
    }
    /**
     * Asks user to enter in the course information for a final course
     */
    public void finalCourse() {
        JOptionPane.showMessageDialog(null, "Enter in the course information for your final course: ");
    }
    /**
     * Tells user that all courses in the list will be displayed
     */
    public void displayingAll() {
        JOptionPane.showMessageDialog(null, "Displaying all courses in the list...");
    }
    /**
     * Tells user which course is being displayed
     */
    public void displayCourseNum(int numC) {
        JOptionPane.showMessageDialog(null, "COURSE " + numC + ": ");
    }
} // end class
