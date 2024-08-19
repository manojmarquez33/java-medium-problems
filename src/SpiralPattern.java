/**
 * Given a number N, the program must print the pattern as described below.
 * Input Format:
 * The first line contains the value of the N which represent the number N.
 * Boundary Conditions:
 * 2 <= N <= 9
 * Output Format:
 * The pattern as described below in the Example Input/Output
 * Example Input/Output 1:
 * Input:
 * 4
 * Output:
 * 4444444
 * 4333334
 * 4322234
 * 4321234
 * 4322234
 * 4333334
 * 4444444
 * */

import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int start = -1*(n-1),end = n,row=0,col=0;

        for(int i=start;i<n;i++,row++){
            System.out.println();
            for (int j=start;j<n;j++,col++){
                System.out.print(Math.max(Math.abs(i)+1,Math.abs(j)+1)+" ");
            }
        }
    }
}
