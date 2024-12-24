import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {

    static boolean isAnagram(String a, String b) {
       
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();

        // Check if they are anagrams
        boolean result = isAnagram(a, b);

        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}
