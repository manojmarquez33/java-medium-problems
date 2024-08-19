/*A string value is passed as input. Reverse the words in the string and print them as the output.
Input Format:
The first line will contain value of the string S.
Boundary Conditions:
Length of the input string will be from 5 to 200.
Output Format:
The words in the string in the reversed order.

Example Input/Output 1:
Input:
first second third
Output:
third second first

Example Input/Output 2:
Input:
I went to Chennai
Output:
Chennai to went I

* */
import java.util.Scanner;

public class ReverseAword {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        StringBuilder sb = new StringBuilder();
        int end = a.length();

        for(int i = a.length()-1;i>=0;i--){
            if (a.charAt(i)==' '){
                sb.append(a.substring(i+1,end));
                if(i!=0) {
                    sb.append(" ");
                }
                end = i;
            }
        }

        sb.append(a.substring(0,end));
        System.out.println(sb.toString());
    }
}