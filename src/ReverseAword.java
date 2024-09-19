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