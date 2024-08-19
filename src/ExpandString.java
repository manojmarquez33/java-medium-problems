import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.nextLine(); //a2b13x4
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<a.length();){
            char ch = a.charAt(i); // a

            if(Character.isAlphabetic(ch)){ //true
                i++; // 1
            }

            int rep = 0;
            while (i < a.length() && Character.isDigit(a.charAt(i))){ //2
                rep = rep * 10 + ((int)a.charAt(i)-48); //0
                i++; //2
            }
            sb.append(String.valueOf(ch).repeat(rep));

        }
        System.out.println(String.valueOf(sb));
    }
}
