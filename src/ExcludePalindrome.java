import java.util.Scanner;

public class ExcludePalindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(filterPalindrome(a));

    }

    public static String filterPalindrome(String a){

        String word[] = a.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length;i++){
            if(!palin(word[i])){
                sb.append(word[i]).append(" ");
            }
        }

        return sb.toString();
    }

    public static boolean palin(String word){

        int left = 0;
        int right = word.length()-1;
        word = word.toLowerCase();
        while (left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
