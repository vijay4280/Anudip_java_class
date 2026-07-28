/* Count the frequency of each character in a string 
 String str = "banana"
  b=1 
 a =3
 n=2 */
public class Frequency {
  public static void main(String[] args) {
    String str = "banana";
    int[] freq = new int[256]; // Assuming ASCII character set

    // Count frequency of each character
    for (int i = 0; i < str.length(); i++) {
        freq[str.charAt(i)]++;
    }

    // Print the frequency of each character
    System.out.println("Character frequencies in the string \"" + str + "\":");
    for (int i = 0; i < freq.length; i++) {
        if (freq[i] > 0) {
            System.out.println((char) i + " = " + freq[i]);
        }
    }
  }
}
