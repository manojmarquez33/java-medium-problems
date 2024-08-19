import java.util.Scanner;

public class DiagonalPattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int n = a.length()-1;
        for(int i=0;i<=n;i++){
                for (int j=0;j<=n;j++){
                    if(i==n/2 && j==n/2){
                        System.out.print(a.charAt(n/2));
                    }
                    if(i==j && i!=n/2){
                        System.out.print(a.charAt(j));
                    } else {
                        System.out.print(" ");
                    }
                    if(j==n-i &&  j!=n/2){
                        System.out.print(a.charAt(j));
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();

        }
    }
}
