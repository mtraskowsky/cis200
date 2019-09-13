public class Student
{   private String name;
    private String userName;
    private double gpa;


    public Student() {
        name = "";
        userName = "";
        gpa = 0;
    }

    public Student(String n, String u, double g) {
        name = n;
        userName = u;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public String getEmail() {
        return (userName + "@ksu.edu"); 
    }

    public String toString() {
       return ("\tStudent name: " + name +
        "\n\tStudent email: " + getEmail() +
        "\n\tStent GPA: " + gpa) + "\n";
    }
    public String toString2() {
        return (name + " - " + gpa);
    }


} // end Student class