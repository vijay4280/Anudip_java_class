import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String str1 = sc.nextLine();
            System.out.print("Enter second string: ");
            String str2 = sc.nextLine();
            if (str1.length() != str2.length()) {
                System.out.println("Strings are not anagrams.");
                return;
            }
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
            freq2[str2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(freq1, freq2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }

        sc.close();
        }
    }
}
    

