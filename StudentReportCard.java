
 public class StudentReportCard {
    private String studentID;
    private String studentName;
    private int marks;

    // Constructor
    public StudentReportCard(String studentID, String studentName, int marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        setMarks(marks);
    }

    // Method to set marks with validation
    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
            this.marks = -1; // Indicate invalid marks
        } else {
            this.marks = marks;
        }
    }

    // Method to display student information
    public void displayReportCard() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        if (marks == -1) {
            System.out.println("Marks: Invalid");
        } else {
            System.out.println("Marks: " + marks);
            System.out.println("Result: " + (marks >= 40 ? "Passed" : "Failed"));
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Creating student objects
        StudentReportCard student1 = new StudentReportCard("S001", "Naresh Gupta", 85);
        StudentReportCard student2 = new StudentReportCard("S002", "Deepak ", 35);
        StudentReportCard student3 = new StudentReportCard("S003", "Vijay", 105); // Invalid marks

        // Displaying report cards
        student1.displayReportCard();
        student2.displayReportCard();
        student3.displayReportCard();
    }
  }
  