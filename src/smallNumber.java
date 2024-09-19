import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an integer N, print the smallest possible integer that can be formed using all the digits of N.
 * Boundary Condition:
 * 1<= N <= 9999999999
 * Input Format:
 * The first line contains N.
 * Output Format:
 * The first line contains the smallest possible integer that can be formed using all the digits of N.
 * Sample Input/Output 1:
 * Input:
 * 45223
 * Output:
 * 22345
 * Sample Input/Output 2:
 * Input:
 * 48903012
 * Output:
 * 10023489
 * */
public class smallNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int l = (int)Math.log10(n);
        int a[] = new int[10];


        for (int i = 0; i < l; i++) {
            int temp = n%10;
            a[temp]++;
            n/=10;
        }

        a[n]++;
        System.out.println(Arrays.toString(a));
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<a.length;i++){
            if(a[i]>0){
                sb.append(i);
                a[i]--;
                break;
            }
        }

        while (a[0]>0){
            sb.append(0);
            a[0]--;
        }

        for(int i=1;i<=9;i++){
            while (a[i]>0){
                sb.append(i);
                a[i]--;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sb.toString());
    }
}
