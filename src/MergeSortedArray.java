import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a1[] = {2,4 ,5, 6, 7, 9, 10, 13};
        int a2[] = {2 ,3, 4 ,5 ,6 ,7 ,8 ,9 ,11 ,15};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a1.length; i++) {
            set.add(a1[i]);
        }

        for (int i = 0; i < a2.length; i++) {
            set.add(a2[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int b[] = new int[list.size()];

        for (int i=0; i<list.size();i++) {
            b[i] = list.get(i);
        }

        for (int val : b){
            System.out.print(val+" ");
        }
        }
    }
