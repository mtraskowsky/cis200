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

public class CourseApp {

    public static void main(String[] args) {

        // create a view object
        View v = new View();

        // create a GUI View object
        // View_GUI v = new View_GUI();

        // creat an array list of course objects
        ArrayList <Course> course = new ArrayList <Course>();

        String addAnother;	
        boolean valid = false;
        while (valid == false) {

        do {
            try {

                String courseNum = v.getCourseNum();
                if (courseNum.equals("")) {
                    valid = false;
                    throw new Exception(v.courseNumError());
                }
                String courseName = v.getCourseName();
                if (courseName.equals("")) {
                    valid = false;
                    throw new Exception(v.courseNameError());
                }
                String firstName = v.getFirstName();
                if (firstName.equals("")) {
                    valid = false;
                    throw new Exception(v.firstNameError());
                }
                String lastName = v.getLastName();
                if (lastName.equals("")) {
                    valid = false;
                    throw new Exception(v.lastNameError());
                }
                String username = v.getUserName();
                if (username.equals("")) {
                    valid = false;
                    throw new Exception(v.userNameError());
                }
                String title = v.getTitle();
                if (title.equals("")) {
                    valid = false;
                    throw new Exception(v.titleError());
                }
                String author = v.getAuthor();
                if (author.equals("")) {
                    valid = false;
                    throw new Exception(v.authorError());
                }

                double price = v.getPrice();

                Instructor courseInstructor = new Instructor(lastName, firstName, username);
                TextBook textbook = new TextBook(title, author, price);
                v.courseAdded();
                course.add(new Course(courseNum, courseName, courseInstructor, textbook));
                valid = true;
            } // end try

            catch (NumberFormatException e) {
                v.numFormatException();
                valid = false;
                break;
            } // end catch
            catch (Exception e) {
                v.errorMessage(e);
                valid = false;
                break;
            } // end catch

            addAnother = v.addAnother();
            if (!addAnother.equalsIgnoreCase("Y")) {
                valid = true;
            }
            
        } while (addAnother.equalsIgnoreCase ("Y") || valid == false);
        } // end while (valid == false) loop

        boolean printAnother = false;
        for (int i = 0; i < course.size(); i++) {
            v.displayCourseNum(i+1);

            String displayCourse = course.get(i).toString();
            v.printCourseInfo(displayCourse);

            String printCourse = v.displayNextCourse();
            if (printCourse.equals("")) {
                printAnother = true;
            }
            else {
                printAnother = false;
                break;
            }  
        }

        v.allCoursesDisplayed();

        boolean courseFound = false;
        do {
            String removeCourse = v.removeCourse();
            for (int j = 0; j < course.size(); j++) {

                if (course.get(j).getNumber().equals(removeCourse)) {
                    course.remove(course.get(j));
                    v.courseRemoveFound(j+1, removeCourse);
                    courseFound = true;  
                }
                else {
                    v.courseNotFound(j+1);
                    }
            }
        } while (courseFound == false);    
  
        v.finalCourse();
        
        boolean validAgain = false;
        while (validAgain == false) { 
        do {
            try {
    
                String courseNum = v.getCourseNum();
                if (courseNum.equals("")) {
                    validAgain = false;
                    throw new Exception(v.courseNumError());
                }
                String courseName = v.getCourseName();
                if (courseName.equals("")) {
                    validAgain = false;
                    throw new Exception(v.courseNameError());
                }
                String firstName = v.getFirstName();
                if (firstName.equals("")) {
                    validAgain = false;
                    throw new Exception(v.firstNameError());
                }
                String lastName = v.getLastName();
                if (lastName.equals("")) {
                    validAgain = false;
                    throw new Exception(v.lastNameError());
                }
                String username = v.getUserName();
                if (username.equals("")) {
                    validAgain = false;
                    throw new Exception(v.userNameError());
                }
                String title = v.getTitle();
                if (title.equals("")) {
                    validAgain = false;
                    throw new Exception(v.titleError());
                }
                String author = v.getAuthor();
                if (author.equals("")) {
                    validAgain = false;
                    throw new Exception(v.authorError());
                }
    
                double price = v.getPrice();

                Instructor courseInstructor = new Instructor(lastName, firstName, username);
                TextBook textbook = new TextBook(title, author, price);
                v.courseAdded();
                course.add(new Course(courseNum, courseName, courseInstructor, textbook));
                validAgain = true;

            } // end try

            catch (NumberFormatException e) {
                v.numFormatException();
                validAgain = false;
                break;
            } // end catch
            catch (Exception e) {
                v.errorMessage(e);
                validAgain = false;
                break;
            } // end catch

            
        } while (validAgain == false);
        } // end while (valid == false) loop

        v.displayingAll();
        for (int i = 0; i < course.size(); i++) {
            v.displayCourseNum(i+1);
            String displayCourse = course.get(i).toString();
            v.printCourseInfo(displayCourse);
            
        }
        v.allCoursesDisplayed();

    } // end main
} // end CourseApp class
