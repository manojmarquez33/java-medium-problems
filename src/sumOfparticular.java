import java.util.Scanner;

public class sumOfparticular {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int mat[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = in.nextInt();
            }
        }

        int x1 =  in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 =  in.nextInt();

        int sum = 0;
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                sum+=mat[i][j];
            }
        }

        System.out.println(sum);

    }
}
