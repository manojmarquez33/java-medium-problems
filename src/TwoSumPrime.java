import java.util.Scanner;

/**
 * Sum of two primes
 *
 * Write a program to find if a given number N can be expressed as a sum of two prime numbers.
 * Note: YOU MUST OPTIMIZE the logic to find whether a number is prime or not, as very large prime numbers are
 * provided as input. If the logic is not optimized your program will NOT get executed within the given time limit.
 * Input Format:
 * First line contains total number of test cases, denoted by T
 * Next T lines will contain the value of N for each testcase.
 * Output Format:
 * T lines containing either yes or no
 * Boundary Conditions / Constraints:
 * 1 <= T <= 25
 * 3 <= N <= 10^9
 * Example Input/Output 1:
 * Input:
 * 5
 * 20
 * 12
 * 23
 * 34
 * 16
 * Output:
 * yes
 * yes
 * no
 * yes
 * yes
 * Explanation:
 * 20 can be expressed as 17+3
 * 12 can be expressed as 7+5
 * 23 cannot be expressed as sum of two primes
 * 34 can be expressed as 31+3 or 11+23 or 17+17
 * 16 can be expressed as 11+5
 * */

public class TwoSumPrime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int testcase = in.nextInt();

        while (testcase-->0){
            int n = in.nextInt();
            boolean isForm = false;
            for(int i=2;i<n/2;i++){
                if(isPrime(i) && isPrime(n-i)){
                    System.out.println(i+" "+(n-i));
                    isForm = true;
                }
            }
            System.out.println(isForm ? "True" : "False");
        }
    }

    public static boolean isPrime(int n){

        if(n<1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;

        for(int i=5;i<Math.sqrt(n);i+=5){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
