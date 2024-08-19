import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Unwanted_Paranthesis{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //String s = in.next();

        System.out.println(removePranthesis("(()()s(sv(sd(d)gvj)(("));
        System.out.println(removePranthesis("(()()s(sv(sd(d)gvj"));
    }
    public static String removePranthesis(String s){

        Stack<Integer> stack = new Stack<>();
        int n = s.length();

        boolean toRemove[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            } else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                } else {
                    toRemove[i]=true;
                }
            }
        }

        while (!stack.isEmpty()){
            toRemove[stack.pop()]=true;
        }

        System.out.println(Arrays.toString(toRemove));
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            if(!toRemove[i]){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}