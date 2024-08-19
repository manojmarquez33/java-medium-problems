/**
 * No Consecutive Digit Substring Count
 * Orlando wants to print the count of substrings in a digit string value S (which contains only digits 0 to 9) based on the condition that the given substring cannot contain two consecutive digits repeated.
 * Input Format:
 * First line contains total number of test cases, denoted by T
 * Next T lines will contain the value of S.
 * Output Format:
 * The count of the substrings which do not contain two consecutive digits repeated.
 * Boundary Conditions / Constraints:
 * 1 <= T <= 25
 * 1 <= Length of S <= 100000
 * Example Input/Output 1:
 * Input:
 * 3
 * 14886
 * 1056
 * 776
 * Output:
 * 9
 * 10
 * 4
 * Explanation:
 * For 14886, the possible 9 substrings are 1,4,8,8,6,14,48,86,148
 * For 1056, the possible 10 substrings are 1,0,5,6,10,05,56,105,056,1056
 * For 776, the possible 4 substrings are 7,7,6,76
 * */

import java.util.Scanner;

public class NoConsecutiveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            String S = scanner.next();
            int n = S.length();
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (isValidSubstring(S.substring(i, j + 1))) {
                        System.out.print(S.substring(i, j + 1)+" ");
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static boolean isValidSubstring(String sub) {
        for (int i = 1; i < sub.length(); i++) {
            if (sub.charAt(i) == sub.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}


/**
 * import java.util.Scanner;
 *
 * public class NoConsecutiveDigitSubstrings {
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *         int T = scanner.nextInt();
 *         while (T-- > 0) {
 *             String S = scanner.next();
 *             int count = countValidSubstrings(S);
 *             System.out.println(count);
 *         }
 *     }
 *
 *     public static int countValidSubstrings(String S) {
 *         int n = S.length();
 *         int count = 0;
 *         int start = 0;
 *
 *         for (int end = 0; end < n; end++) {
 *             if (end > 0 && S.charAt(end) == S.charAt(end - 1)) {
 *                 start = end;
 *             }
 *             count += (end - start + 1);
 *         }
 *         return count;
 *     }
 * }*/