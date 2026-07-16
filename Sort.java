/*	you are supposed to take input from user and create an array
4. sort and array in descending order */
public class Sort {
  public static void main(String[] args) {
    int[] arr = {5, 10, 15, 20, 25};
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          // swap arr[j] and arr[j+1]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println("Array sorted in descending order: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
