import java.util.Scanner;

public class EquilibriumPoint {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] =  in.nextInt();
        }
        int sum =0; int left=0;

        for(int tot: a) {
            sum+=tot;
        }
        for(int i=0;i<n;i++){
            sum-=a[i];
            if(left==sum) {
                System.out.print(a[i] + " ");
            }
            left+=a[i];
        }
    }
}
