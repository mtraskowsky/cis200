public class Line {
	private double slope;
	private double y_intercept;

	public Line(Point first, Point second) {
		//initialize slope and y_intercept (use forumula from the lab writeup)
        //can access point values like this: first.getX()
        
        //int x = first;
        //int y = second;

        int x1 = first.getX();
        int x2 = second.getX();

        int y1 = first.getY();
        int y2 = second.getY();
		
        slope = (y2- y1) / (x2 - x1);
        y_intercept = y1 - slope * x1;
		
	} // end 2-arg constructor

	public String toString() {
		//return a string of the form "y=mx+b" representing this line
		//DO NOT print it here
        //m is the slope and b is the y_intercept
        
        StringBuilder sb = new StringBuilder();

        sb.append("\ny = " + slope + "x " + " + " + y_intercept);
        sb.append("\n");

        return sb.toString();

	} // end toString()

	public boolean intersects(Line another) {
		//return true if THIS line (using the slope and y_intercept instance variables)
		//intersects another

		//two lines will intersect if their slopes are different
		//they will also intersect if the slopes AND y_intercepts are the same
		//otherwise, they will not intersect
		boolean intersects = false;
		if (this.slope != another.slope) {
            intersects = true;
        }
		if (this.slope == another.slope && this.y_intercept == another.y_intercept) {
            intersects = true;
        }
		return intersects;
	} // end intersects()

} // end class