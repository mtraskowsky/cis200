import java.util.*;

public class Lab10 {
 public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
		
	//Declare an ArrayList to hold Student Objects
    ArrayList <Student> list = new ArrayList<>();

	String reply;	
    boolean valid = false;
    while (valid == false) {
	do {
        
        try {
		System.out.print("Enter the student's name: ");
        String name = s.nextLine();
        if (name.equals("")) {
            valid = false;
            throw new Exception("Name is required (Please re-enter) ");
        }
        
		System.out.print("Enter student's user name: ");
        String userName = s.nextLine();
        if (userName.equals("")) {
            throw new Exception("User name is required (Please re-enter) ");
        }

		System.out.print("Enter student's GPA: ");
		double gpa = Double.parseDouble(s.nextLine());
        if (gpa >= 0.0 && gpa <= 4.0) {
            valid = true;
        }
        else {
            throw new Exception("GPA must be between 0.0-4.0 (inclusive). Please re-enter: 2.2 ");
        }
		//Create a student object and add to the arraylist
		System.out.println("Student added to the arraylist...");
        list.add(new Student(name, userName, gpa));
        } // end try


        catch (NumberFormatException e) {
            System.out.println("No characters allowed for GPA. Please re-enter all information.");
            valid = false;
            break;
        }
        catch (Exception e) {
            System.out.println(e);
            valid = false;
            break;
        }


		System.out.print("\nAdd another student? ('Y' or 'N'): ");
		reply = s.nextLine();

	} while (reply.equalsIgnoreCase ("Y")|| valid == false);
} // end while loop

	//Create a loop that uses the toString method in the Student class
    // to display all objects added to the arraylist
    
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

        System.out.println("Students on the Dean's List");
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).getGPA() >= 3.0) {
                System.out.println(list.get(j).toString2());
            }
        }
 } // end main
} // end class Lab10