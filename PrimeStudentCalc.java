/*Assignment 3 – Student Average Calculator Using Runnable
Create a Java program to calculate the average marks of each student using multiple threads.

You are given the marks of 4 students in 4 subjects:

Student

Math

Science

English

Computer

Student 1

85

90

78

88

Student 2

70

65

80

75

Student 3

95

92

96

94

Student 4

60

72

68

70

Requirements
Use the Runnable interface only.

Create one thread for each student.

Each thread should calculate:

Total marks of the student

Average marks of the student

After all threads finish, display the class total and class average.

Expected Output
Student 1 Total = 341 | Average = 85.25

Student 2 Total = 290 | Average = 72.50

Student 3 Total = 377 | Average = 94.25

Student 4 Total = 270 | Average = 67.50


Class Total = 1278

Class Average = 79.88

 */

 public class PrimeStudentCalc implements Runnable {
    private String studentName;
    private int[] marks;
    private int totalMarks;
    private double averageMarks;

    public PrimeStudentCalc(String studentName, int[] marks) {
        this.studentName = studentName;
        this.marks = marks;
        this.totalMarks = 0;
        this.averageMarks = 0.0;
    }

    @Override
    public void run() {
        for (int mark : marks) {
            totalMarks += mark;
        }
        averageMarks = (double) totalMarks / marks.length;
        System.out.println(studentName + " Total = " + totalMarks + " | Average = " + String.format("%.2f", averageMarks));
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] studentMarks = {
            {85, 90, 78, 88}, // Student 1
            {70, 65, 80, 75}, // Student 2
            {95, 92, 96, 94}, // Student 3
            {60, 72, 68, 70}  // Student 4
        };

        String[] studentNames = {"Student 1", "Student 2", "Student 3", "Student 4"};
        Thread[] threads = new Thread[studentNames.length];
        PrimeStudentCalc[] calculators = new PrimeStudentCalc[studentNames.length];

        for (int i = 0; i < studentNames.length; i++) {
            calculators[i] = new PrimeStudentCalc(studentNames[i], studentMarks[i]);
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
        }

        int classTotal = 0;

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
            classTotal += calculators[i].getTotalMarks();
        }

        double classAverage = (double) classTotal / (studentNames.length * studentMarks[0].length);
        System.out.println("Class Total = " + classTotal);
        System.out.println("Class Average = " + String.format("%.2f", classAverage));
    }
 }