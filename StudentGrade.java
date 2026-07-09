/* wap to take marks of a student as input and display the grade according to the following criteria:
- 90 and above: A
- 75 to 89: B
- 60 to 74: C
- Below 60: D*/ 
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of the student: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        sc.close();
    }
}
