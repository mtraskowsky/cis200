//import java.util.*;
using System;

public class StudentApp_Arrays
{
  public static void Main(String[] args)
  { //Scanner in = new Scanner(System.in);

		Console.Write("How many students to you wish to process? ");
		int numStudents = Integer.parseInt(in.nextLine());
		Student [ ] student = new Student[numStudents];

	// Read in student info then course info for each course
	for (int i = 0; i < numStudents; i++) {
		Console.Write("Enter in Student name: ");
		String name = in.nextLine();
		Console.Write("Enter in major: ");
		String major = in.nextLine();
		Console.Write("Enter in number of courses: ");
		int courses = Integer.parseInt(in.nextLine());

		// instantiate Student object!
		student[i] = new Student(name, major, courses);
		
		for (int j = 0; j < courses; j++) { 
			Console.Write("Enter in Credit Hours for Course " + (j+1) + ": ");
			int hours = Integer.parseInt(in.nextLine());
			Console.Write("Enter in Grade for Course " + (j+1) + ": ");
			String s = in.nextLine();
			char grade = s.charAt(0);
			student[i].addInfo(hours, grade);
		} // end for - course info

	} // end for - student info
	
	// Display student information using toString method
	for (int i = 0; i < numStudents; i++) 
		Console.WriteLine(student[i]);

 	} // end main
} // end class StudentApp_Arrays