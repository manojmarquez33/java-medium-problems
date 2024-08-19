import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NthTwoDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int N = in.nextInt();
        in.close();

        System.out.println(findNthNumber(d1, d2, N));
    }

    public static String findNthNumber(int d1, int d2, int N) {
        Queue<String> queue = new LinkedList<>();

        // Start with the single-digit numbers
        queue.add(String.valueOf(d1));
        queue.add(String.valueOf(d2));

        String result = "";
        int count = 0;

        // Perform BFS to find the Nth number
        while (count < N) {
            result = queue.poll();  // Get the current number
            count++;

            // Append d1 and d2 to generate new numbers and add them to the queue
            queue.add(result + d1);
            queue.add(result + d2);
        }

        return result;
    }
}
