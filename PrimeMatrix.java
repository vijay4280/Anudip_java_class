/*Assignment 2 – Matrix Row Sum Using Runnable


Create a Java program to calculate the sum of each row of the following matrix using multiple threads.


10   20   30   40

5    15   25   35

2    4    6    8

100  200  300  4


For this assignment, you must use the Runnable interface.


Create one task for each row, so that:


* Thread 1 calculates the sum of row 1.

* Thread 2 calculates the sum of row 2.

* Thread 3 calculates the sum of row 3.

* Thread 4 calculates the sum of row 4.


The program should display the sum of each row and finally display the total sum of the complete matrix.


Row 1 Sum = 100

Row 2 Sum = 80

Row 3 Sum = 20

Row 4 Sum = 1000


Total Sum = 1200

 */

public class PrimeMatrix implements Runnable {
    private int[][] matrix;
    private int rowIndex;
    private int rowSum;

    public PrimeMatrix(int[][] matrix, int rowIndex) {
        this.matrix = matrix;
        this.rowIndex = rowIndex;
        this.rowSum = 0;
    }

    @Override
    public void run() {
        for (int num : matrix[rowIndex]) {
            rowSum += num;
        }
        System.out.println("Row " + (rowIndex + 1) + " Sum = " + rowSum);
    }

    public int getRowSum() {
        return rowSum;
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = {
            {10, 20, 30, 40},
            {5, 15, 25, 35},
            {2, 4, 6, 8},
            {100, 200, 300, 4}
        };

        Thread[] threads = new Thread[matrix.length];
        PrimeMatrix[] tasks = new PrimeMatrix[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            tasks[i] = new PrimeMatrix(matrix, i);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        int totalSum = 0;
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
            totalSum += tasks[i].getRowSum();
        }

        System.out.println("Total Sum = " + totalSum);
    }
  }
