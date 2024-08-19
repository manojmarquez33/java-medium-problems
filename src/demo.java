import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();

        int a[] =  new int[n];
        for(int i=0;i<n;a[i]=in.nextInt(),i++);


        for(int i=0;i<n-k;i++){
            int max = a[i];
            System.out.print("i:"+i);
            for(int j=i;j<i+k;j++){
                System.out.print(" j :"+j+" ");
                System.out.print(" "+i+" to "+(i+k)+" ");
                if(a[j]>max){
                    max = a[j];
                }
            }
            System.out.print(max+" "+"  \n");
        }
    }
}

