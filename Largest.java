/*you are supposed to take input from user and create an array
3. find the largest element in array
 */
public class Largest {
  public static void main(String[] args) {
    int[] arr = {5, 10, 15, 20, 25};
    int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    System.out.println("The largest element in the array is: " + largest);
  }
}
