/*Sum of Each Row and Each Column

Find and display the sum of every row and every column separately.
Example Output:

Row 1 Sum = 6
Row 2 Sum = 15
Row 3 Sum = 24

Column 1 Sum = 12
Column 2 Sum = 15
Column 3 Sum = 18  */
public class ArraySumRc {
  public static void main(String[] args) {
    int[][] arr = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    // Calculate and print sum of each row
    for (int i = 0; i < arr.length; i++) {
      int rowSum = 0;
      for (int j = 0; j < arr[i].length; j++) {
        rowSum += arr[i][j];
      }
      System.out.println("Row " + (i + 1) + " Sum = " + rowSum);
    }

    // Calculate and print sum of each column
    for (int j = 0; j < arr[0].length; j++) {
      int colSum = 0;
      for (int i = 0; i < arr.length; i++) {
        colSum += arr[i][j];
      }
      System.out.println("Column " + (j + 1) + " Sum = " + colSum);
    }
  }
}
