/**
 Given a string S of length L, the program must store the characters of the string S in a two dimensional array and search for a given sub-string SUB in the two dimensional array both from left to right and from top to bottom. If found the program must print the start index and end index of the sub-string. (Note: The sub-string (if present) will be present only once in the 2D array). If the sub-string is NOT present the program must print -1 as the output.
 Input Format:
 The first line contains the value of the string S.
 The second line contains the value of the sub-string SUB.
 The third line contains the column count in a given row of the 2D array.
 Boundary Conditions:
 The length of the String S is from 4 to 100.
 4 <= L (Length of S) <= 100
 Output Format:
 If the sub-string is found,
 The first line contains the start index.
 The second line contains the end index.
 If the sub-string is not found,
 The first line contains -1

 Example Input/Output 1:
 Input:
 WELCOMETOZOHOCORPORATION
 TOO
 5
 Output:
 1,2
 3,2
 Explanation:
 As there are 5 columns in a row in the 2D array, the representation is like
 W E L C O
 M E T O Z
 O H O C O
 R P O R A
 T I O N
 TOO is found when searching from top to bottom in 3rd column (starting from 2nd row and ending in 4th row)
 So the start index is 1,2 (As index starts from 0)
 and the end index is 3,2
 * */
import java.util.Scanner;

public class ArraySubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String:");
        String s = in.nextLine();

        System.out.println("Enter sub string:");
        String sub = in.next();

        System.out.println("Enter count:");
        int col = in.nextInt();

        int n = s.length();
        int row = (int) Math.ceil((double) n / col);
        char[][] a = new char[row][col];

        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (index < n) {
                    a[i][j] = s.charAt(index++);
                } else {
                    a[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[] leftToRight = leftToRightSearch(a, sub, row, col);
        if (leftToRight[0] != -1) {
            System.out.println(leftToRight[0] + "," + leftToRight[1]);
            System.out.println(leftToRight[2] + "," + leftToRight[3]);
        } else {
            int[] topToBottom = topToBottomSearch(a, sub, row, col);
            if (topToBottom[0] != -1) {
                System.out.println(topToBottom[0] + "," + topToBottom[1]);
                System.out.println(topToBottom[2] + "," + topToBottom[3]);
            } else {
                System.out.println(-1);
            }
        }
    }


    public static int[] leftToRightSearch(char[][] a, String sub, int row, int col) {
        int[] index = {-1, -1, -1, -1};
        int subLength = sub.length();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= col - subLength; j++) {
                boolean found = true;
                for (int k = 0; k < subLength; k++) {
                    if (a[i][j + k] != sub.charAt(k)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    index[0] = i;
                    index[1] = j;
                    index[2] = i;
                    index[3] = j + subLength - 1;
                    return index;
                }
            }
        }
        return index;
    }


    public static int[] topToBottomSearch(char[][] a, String sub, int row, int col) {
        int[] index = {-1, -1, -1, -1};
        int subLength = sub.length();

        for (int j = 0; j < col; j++) {
            for (int i = 0; i <= row - subLength; i++) {
                boolean found = true;
                for (int k = 0; k < subLength; k++) {
                    if (a[i + k][j] != sub.charAt(k)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    index[0] = i;
                    index[1] = j;
                    index[2] = i + subLength - 1;
                    index[3] = j;
                    return index;
                }
            }
        }
        return index;
    }
}
