/**
 *      2.Array Maximum Sum Divisible By N
 * An array of numbers separated by space will be passed as input. A number N is also passed as input. The program has to print the maximum sum of the numbers in the array which is divisible by N. If there is no such maximum sum of the numbers, the program should print -1 as output.
 * Input Format:
 * The first line contains the array of numbers separated by space.
 * The second line contains the value of N
 * Boundary Conditions:
 * The length of the array of numbers will be from 3 to 200.
 * 1 <= N <= 1000
 * Output Format:
 * The maximum sum of the numbers in the array that is divisible by N.
 *
 * Example Input/Output 1:
 * Input:
 * 10 20 40 70
 * 3
 * Output:
 * 120
 * Explanation:
 * The maximum sum of numbers that is divisible by 3 is 120 (10+40+70) and hence it is printed as the output.
 *
 * Example Input/Output 2:
 * Input:
 * 22 34 54 80 93 41
 * 5
 * Output:
 * 290
 * Explanation:
 * The maximum sum of numbers that is divisible by 5 is 290 (22+54+80+93+41) and hence it is printed as the output.
 * */
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum_Divisible {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int num = in.nextInt();
        // 10 20 40 70  n=3    Output: //120



        System.out.println(findMaxSum(a,num,n));
    }

    static int findMaxSum(int a[],int num,int n){

        int maxsum = -1;
        int totalsubset = (int)Math.pow(2,n);
        for (int i = 0; i < totalsubset; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += a[j];
                }


            if(sum%num==0){
                    maxsum = Math.max(sum,maxsum);
                }
            }
        }

        return maxsum;
    }
}
