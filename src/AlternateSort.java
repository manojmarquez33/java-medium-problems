/**
 * Given an array of N integers, rearrange the array in such a way that the first element is first maximum, second element is first minimum, third element is second maximum, fourth element is second minimum and so on.
 * Input Format:
 * The first line contains the value of the N integers separated by one or more spaces.
 * Boundary Conditions:
 * 4 <= N <= 100
 * Output Format:
 * The N numbers alternately sorted as per the given instructions.
 * Example Input/Output 1:
 * Input:
 * 1 2 3 4 5 6 7
 * Output:
 * 7 1 6 2 5 3 4
 * */
import java.util.Arrays;
import java.util.Scanner;

public class AlternateSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;a[i]=in.nextInt(),i++);

        Arrays.sort(a);
        for(int i=0;i<n/2;i++){
            System.out.print(a[n-i-1]+" ");
            System.out.print(a[i]+" ");
        }
        if(n%2==1) System.out.print(a[n/2]);
    }
}
