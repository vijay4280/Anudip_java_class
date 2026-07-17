/*  //           {10, 20, 30},
  // //         {40, 50, 60},
  // //         {70, 80, 90}

1. print only the primary diagonal : 10 50 90
2. print only the secondary diagonal : 30 50 70
3. Count how many even and odd numbers are present in a 2D array.  */
public class ArrayDiagonal {
  public static void main(String[] args) {
    int[][] arr = {
      {10, 20, 30},
      {40, 50, 60},
      {70, 80, 90}
    };

    // Print primary diagonal
    System.out.print("Primary Diagonal: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i][i] + " ");
    }
    System.out.println();

    // Print secondary diagonal
    System.out.print("Secondary Diagonal: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i][arr.length - 1 - i] + " ");
    }
    System.out.println();

    // Count even and odd numbers
    int evenCount = 0;
    int oddCount = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] % 2 == 0) {
          evenCount++;
        } else {
          oddCount++;
        }
      }
    }

    System.out.println("Even numbers count: " + evenCount);
    System.out.println("Odd numbers count: " + oddCount);
  }
}
