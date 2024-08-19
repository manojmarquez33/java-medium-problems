import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k (number of students): ");
        int k = scanner.nextInt();

        int[] prices = new int[n];
        System.out.print("Enter the prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        Arrays.sort(prices);

        int minDiff = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int i = 0; i <= n - k; i++) {
            int diff = prices[i + k - 1] - prices[i];
            if (diff < minDiff) {
                minDiff = diff;
                startIndex = i;
            }
        }

        System.out.println("Output: " + prices[startIndex] + " " + prices[startIndex + k - 1]);
    }
}
