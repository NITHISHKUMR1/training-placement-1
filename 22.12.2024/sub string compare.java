public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring; // Update smallest
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring; // Update largest
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        // Example input
        String s = "welcometojava";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));
    }
}
