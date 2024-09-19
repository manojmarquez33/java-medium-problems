import java.util.Scanner;


public class expandStrNo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.nextLine(); //4a5b
        int n = a.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++){
            char ch = a.charAt(i);
            if(Character.isDigit(ch)){
               int time = 0;
                while (i < n && Character.isDigit(a.charAt(i))) { // 1b23a
                    int num = (int) ch - 48;
                    time = time*10 + num;
                    i++;
                }
                if(i < n)
                sb.append(repeat(a.charAt(i), time));
            }
        }

        System.out.println(sb.toString());
    }

    public static String repeat(char c, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}
