/**
 * Rectangular Sum
 * 
 * Given an integer matrix of size MxN and indices which forms a rectangle within the matrix, print the sum of integers present inside the rectangle.
 * Boundary Condition:
 * 1<= M,N <= 100
 * Input Format:
 * The first line contains M and N separated by space.
 * The next M lines contain the matrix.
 * The (M+2)th line contains the indices of the rectangle (top left and botton right corners) separated by space.
 * Output Format:
 * The first line contains the sum of all elements in the rectangle.
 * Sample Input/Output 1:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 1 0 2 2
 * Output:
 * 39
 * Sample Input/Output 2:
 * 4 5
 * 33 46 11 49 79
 * 91 38 32 26 77
 * 53 93 70 65 72
 * 76 69 1 2 50
 * 1 1 2 2
 * Output:
 * 233
 * */

import java.util.Scanner;
import com.mano.p
public class RectangularSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int a[][] = new int[m][n];
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               a[i][j] = in.nextInt();
           }
        }

        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        int sum = 0;
        for(int i=x1;i<=y1;i++){
            for (int j=x2;j<=y2;j++){
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}
