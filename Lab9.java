import java.util.*;

public class Lab9 {
	public static void main(String[] args) {
			Point[] points = new Point[4];

			points[0] = new Point(1,1);
			//fill the rest of the array with the points (3,3), (0,4), and (1,6)
            points[1] = new Point(3,3);
            points[2] = new Point(0,4);
            points[3] = new Point(1,6);

			//create a Line object with the first two points in the array.  Call it line1
            Line line1 = new Line(points[0], points[1]);
            
			//create a Line object with the second two points in the array.  Call it line2.
            Line line2 = new Line(points[2], points[3]);

			//print line1 by calling toString
            System.out.println("Line 1: " + line1.toString());
			//print line2 by calling toString
            System.out.println("Line 2: " + line2.toString());

            //call 'intersects' method to see if line1 intersects line2.  
            line1.intersects(line2);
			//Store the result in a boolean variable.
            boolean lineIntersect = line1.intersects(line2);
			//if the result is true, print "Lines intersect"
            if (lineIntersect == true){
                System.out.println("Lines intersect");
            }
			//if the result is not true, print "Lines do NOT intersect"
			else {
                System.out.println("Lines do NOT intersect");
            }
	} // end main
} // end class