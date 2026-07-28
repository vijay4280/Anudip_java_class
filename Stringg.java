/* */ 
public class Stringg {
   public static void main(String[] args) {
    String str = "banana";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                count++;
            }
        }
        System.out.println(ch + " = " + count);
    }
    boolean visited = false;

    for(int j = 0; j < str.length(); j++) {
        char ch = str.charAt(j);
        visited = false;
        for (int k = 0; k < j; k++) {
            if (str.charAt(k) == ch) {
                visited = true;
                break;
            }
        }
        if (!visited) {
            int count = 0;
            for (int l = 0; l < str.length(); l++) {
                if (str.charAt(l) == ch) {
                    count++;
                }
            } 
            System.out.println(ch + " = " + count);
        }
    }
   }
}
