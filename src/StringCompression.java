import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        int n = a.length();
        for(int i=0;i<a.length();i++){
            int count = 1;
            while (i<n-1 && a.charAt(i)==a.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(a.charAt(i)+""+count );
        }
    }
}
