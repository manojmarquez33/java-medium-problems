import java.util.Arrays;
import java.util.Scanner;

/**
Exclude Palindrome Words

Given a string S with multiple words, print only the words which are not palindrome. The palindrome check is case insensitive (That is MALAyalam is a palindrome).
Boundary Condition:
        1 <= Length of S <= 10000
Input Format:
The first line contains the string S.
Output Format:
The first line contains the string with words which are not palindromes.
Sample Input/Output 1:
Hi madam how can I help you?
Output:
Hi how can help you?
Sample Input/Output 2:
I am not Anna
Output:
am not
*/

public class NonPalindromeWord {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        String word[] = a.split(" ");

        //System.out.println(Arrays.toString(word));

        for(int i=0;i<word.length;i++){
            if(!palindrome(word[i])){
                System.out.print(word[i]+" ");
            }
        }
    }

    public static boolean palindrome (String word){

        String a = word.replaceAll("[^a-zA-Z]","").toLowerCase();
        int n = a.length();
        for(int i=0;i<n/2;i++){
            if(a.charAt(i)!=a.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
