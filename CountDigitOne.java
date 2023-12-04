public class CountDigitOne {

    public static int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 13;
        int n1=0;
        int result = countDigitOne(n);
        int result1 = countDigitOne(n1);
        System.out.println("The total number of digit 1 in numbers up to " + n + " is: " + result);
         System.out.println("The total number of digit 1 in numbers up to " + n1+ " is: " + result1);
    }
}