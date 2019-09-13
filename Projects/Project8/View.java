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
import java.util.*;

public class View {
    private Scanner s;

    public View() {
		s = new Scanner(System.in);
    }

    // USER PROMPTS FOR COURSE INFO
    /**
     * Gets the course number from the user
     * @return course number
     */
    public String getCourseNum() {
        System.out.print("Please enter the course number: ");
        String courseNum = s.nextLine();
        return courseNum;
    }
    /**
     * Gets the course name from the user
     * @return course name
     */
    public String getCourseName() {
        System.out.print("Please enter the course name: ");
        String courseName = s.nextLine();
        return courseName;
    }
    /**
     * Gets the instructor first name from the user
     * @return instructor first name
     */
    public String getFirstName() {
        System.out.print("Please enter the instructor's first name: ");
        String firstName = s.nextLine();
        return firstName;
    }
    /**
     * Gets the instructor last name from the user
     * @return instructor last name
     */
    public String getLastName() {
        System.out.print("Please enter the instructor's last name: ");
        String lastName = s.nextLine();
        return lastName;
    }
    /**
     * Gets the instructor username from the user
     * @return instructor username
     */
    public String getUserName() {
        System.out.print("Please enter the instructor's username: ");
        String userName = s.nextLine();
        return userName;
    }
    /**
     * Gets the textbook title from the user
     * @return textbook title
     */
    public String getTitle() {
        System.out.print("Please enter the title of the textbook: ");
        String title = s.nextLine();
        return title;
    }
    /**
     * Gets the textbook author from the user
     * @return textbook author
     */
    public String getAuthor() {
        System.out.print("Please enter the author of the textbook: ");
        String author = s.nextLine();
        return author;
    }
    /**
     * Gets the textbook price from the user
     * @return textbook price
     */
    public double getPrice() {
        System.out.print("Please enter the price of the textbook: ");
        double price = Double.parseDouble(s.nextLine());
        return price;
    }


    // ERRORS
    /**
     * Generates an error if invalid input is entered for course number
     * @return course number error
     */
    public String courseNumError() {
        String courseNumError = "Course number is required (Please re-enter all information) ";
        return courseNumError;
    }
    /**
     * Generates an error if invalid input is entered for course name
     * @return course name error
     */
    public String courseNameError() {
        String courseNameError = "Course name is required (Please re-enter all information) ";
        return courseNameError;
    }
    /**
     * Generates an error if invalid input is entered for instructor first name
     * @return instructor first name error
     */
    public String firstNameError() {
        String firstNameError = "Instructor's first name is required (Please re-enter all information) ";
        return firstNameError;
    }
    /**
     * Generates an error if invalid input is entered for instructor last name
     * @return instructor last name error
     */
    public String lastNameError() {
        String lastNameError = "Instructor's last name is required (Please re-enter all information) ";
        return lastNameError;
    }
    /**
     * Generates an error if invalid input is entered for instructor username
     * @return instructor username error
     */
    public String userNameError() {
        String userNameError = "Instructor's username is required (Please re-enter all information) ";
        return userNameError;
    }
    /**
     * Generates an error if invalid input is entered for textbook title
     * @return textbook title error
     */
    public String titleError() {
        String titleError = "Textbook title is required (Please re-enter all information) ";
        return titleError;
    }
    /**
     * Generates an error if invalid input is entered for textbook author
     * @return textbook author error
     */
    public String authorError() {
        String authorError = "Textbook author is required (Please re-enter all information) ";
        return authorError;
    }
    /**
     * Displays a message saying the course has been added to the array list
     */
    public void courseAdded() {
        System.out.println();
        System.out.println("Course added to the array list!");
    }
    /**
     * Displays an error message saying no chars allowed for price 
     */
    public void numFormatException() {
        System.out.println("No characters allowed for price of textbook. Please re-enter all information for this course.");
    }
    /**
     * Generates java error message
     * @param e Error message
     */
    public void errorMessage(Exception e) {
        System.out.println(e);
    }
    /**
     * Asks user if they want to add another course
     * @return user's answer, Y or N
     */
    public String addAnother() {
        System.out.print("\nAdd another course? ('Y' or 'N'): ");
        String addAnother = s.nextLine();
        return addAnother;
    }
    /**
     * Displays all course information entered in by the user
     * @param courseInfo course information
     */
    public void printCourseInfo(String courseInfo) {
        System.out.println(courseInfo);
        System.out.println();
    }
    /**
     * Asks user if they want to display the next course
     * @return the user's answer on whether to display next course or not
     */
    public String displayNextCourse() {
        System.out.print("Press enter to display another course:");
        String printCourse = s.nextLine();
        return printCourse;
    }
    /**
     * Displays to user that all courses have been displayed
     */
    public void allCoursesDisplayed() {
        System.out.println();
        System.out.println("All courses have been displayed!");
        System.out.println();
    }
    /**
     * Asks user to enter in the course that they want to remove
     * @return the course that the user wants to remove
     */
    public String removeCourse(){
            System.out.println();
            System.out.print("Enter the number of any course that you would like to remove: ");
            String removeCourse = s.nextLine();
            System.out.println();
            System.out.println("Searching through the list of courses...");
            System.out.println();
            return removeCourse;
    }
    /**
     * Tells user that the course they want to remove has been found and will be removed
     */
    public void courseRemoveFound(int courseNum, String removeCourse) {
        System.out.println("Course " + courseNum + " matches the course that you want to remove. " + removeCourse + " has been removed from the arraylist of courses.");
    }
    /**
     * Tells user that the course they want to remove has not been found
     */
    public void courseNotFound(int courseNum) {
        System.out.println("Course " + courseNum + " was not a match for the course that you want to remove.");
    }
    /**
     * Asks user to enter in the course information for a final course
     */
    public void finalCourse() {
        System.out.println();
        System.out.println();
        System.out.println("Enter in the course information for your final course: ");
        System.out.println();
    }
    /**
     * Tells user that all courses in the list will be displayed
     */
    public void displayingAll() {
        System.out.println();
        System.out.println("Displaying all courses in the list...");
        System.out.println();
    }
    /**
     * Tells user which course is being displayed
     */
    public void displayCourseNum(int numC) {
        System.out.println();
        System.out.println("COURSE " + numC + ": ");
    }
} // end View class
