public class ShortestPalindrome {

    public static String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = new int[2 * n + 1];
        computeLPS(combined, lps);

        int len = lps[2 * n];
        String suffix = rev.substring(0, n - len);
        return suffix + s;
    }

    private static void computeLPS(String s, int[] lps) {
        int n = s.length();
        int i = 1, len = 0;
        lps[0] = 0;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String input = "abcd";
         String input1 ="aacecaaa";
        String result = shortestPalindrome(input);
        String result1 = shortestPalindrome(input1);
        System.out.println("Shortest Palindrome: " + result);
        System.out.println("Shortest Palindrome: " + result1);
    }
}

    

