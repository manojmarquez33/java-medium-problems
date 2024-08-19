import java.util.*;

public class WeigthBasedSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = in.nextInt();
        Integer a[] = new Integer[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int weight = 0;
            int val = a[i];
            int pow = (int)Math.sqrt(val);

            if(( pow*pow )==val){
                weight+=5;
            }
            if(val%4==0 && val%6==0){
                weight+=4;
            }

            if (val%2==0){
                weight+=2;
            }

            map.put(val,weight);
        }

        System.out.println("\nKeys :");
        for (int key : map.keySet()){
            System.out.print(key+" ");
        }
        System.out.println("\nValues :");
        for(int val : map.values()){
            System.out.print(val+" ");
        }


        List<Integer> list = new ArrayList<>(Arrays.asList(a));

        Collections.sort(list,(n1,n2) ->{
            int e1 = map.get(n1);
            int e2 = map.get(n2);

            if (e1!=e2){
                return e2 - e1;
            }

            return n2 - n1;
        });

        System.out.println("\nSorted :");
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.print(result[i]+" ");
        }
    }
}
