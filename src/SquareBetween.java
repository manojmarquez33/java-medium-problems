
/**
Squares Between A and B

Given two numbers A and B, the program must find the square numbers which lie between A and B(inclusive) and print them as output.
Input Format:
The first line will contain A
The second line will contain B
Output Format:
The square numbers which lie between A and B separated by a comma
Constraints:
        1 <= A <= 1000000
        1 <= B <= 1000000
A <= B
Example Input/Output 1:
Input:
        18
        100
Output:
        25,36,49,64,81,100
*/

import java.util.Scanner;
public class SquareBetween {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int count = 0;
        int start = (int)Math.ceil(Math.sqrt(a));
        int end = (int)Math.ceil(Math.sqrt(b));

        boolean first = true;
        for(int i=start;i<=end;i++){
            int val = i*i;
            if(!first) {
                System.out.print(",");
            }
            System.out.print(val);
            first = false;
        }
    }
}
