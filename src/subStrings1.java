import java.util.Scanner;

public class subStrings1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine(); //hello world
        String b = in.nextLine(); //world

        int index = -1;

        for(int i=0;i<=a.length()-b.length();i++){
            boolean found = true;
            for(int j=0;j<b.length();j++){
                if(a.charAt(i+j)!=b.charAt(j)){ //0+0
                    found = false;
                    break;
                }
            }


            if (found){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
