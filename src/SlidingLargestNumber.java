/**
Sliding Window Largest Number

Given a sliding window of size K from a array of size N (N >= K), the program must print the maximum of the K numbers present for all possible sliding windows.
Input Format:
The first line will contain the value of K
The second line will contain the value of N
The third line will contain N values separated by a space.
Output Format:
The maximum of the numbers in each sliding window.
        Constraints:
        1 <= N <= 1000
        1 <= K <= 1000
K <= N
Example Input/Output 1:
Input:
        3
        9
        3 2 7 6 5 1 2 3 4
Output:
        7 7 7 6 5 3 4
Explanation:
The sliding windows (as K=3) are 3 2 7, 2 7 6, 7 6 5, 6 5 1, 5 1 2, 1 2 3, 2 3 4
The maximum values in these windows are 7 7 7 6 5 3 4
*/

import java.util.Scanner;

public class SlidingLargestNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; a[i] = in.nextInt(), i++) ;

        for (int i = 0; i < n - k; i++) {
            int max = a[i];
            for (int j = i; j <=i + k; j++){
                if (a[j] > max) {
                    max = a[j];
                }
        }
        System.out.print(max + " ");
    }

    }
}