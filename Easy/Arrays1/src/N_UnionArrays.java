import java.util.*;
public class N_UnionArrays {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,5,5};

        int[] b={1,2,6,7,8,9,10,12};

        int n=a.length;
        int m=b.length;

        ArrayList<Integer> Union = FindUnionUsingSet(a,b, n, m);
        System.out.println(Union);
        System.out.println("------map-------");
        ArrayList<Integer> u = FindUnionUsingMap(a,b, n, m);
        System.out.println(u);
        System.out.println("-------------------------GFG SOLUTION--------------------------------");
//        ArrayList<Integer> uni = FindUnion(a,b, n, m);
//        System.out.println(u);
    }

//    private static ArrayList<Integer> FindUnion(int[] a, int[] b, int n, int m) {
//
//    }

    private static ArrayList<Integer> FindUnionUsingMap(int[] a, int[] b, int n, int m) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<n;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }

        for(int i=0;i<m;i++){
            hm.put(b[i],hm.getOrDefault(b[i],0)+1);
        }

        for(int j:hm.keySet()){
            al.add(j);
        }

        return al;

    }

    private static ArrayList<Integer> FindUnionUsingSet(int[] a, int[] b, int n, int m) {
        ArrayList<Integer> list=new ArrayList<>();

        HashSet<Integer> h=new HashSet<>();

        for(int i=0;i<n;i++){
            h.add(a[i]);
        }

        System.out.println(h);//[1, 2, 3, 4, 5]

        for(int i=0;i<m;i++){
            h.add(b[i]);
        }
        System.out.println(h);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12]
        for(int it:h){
            list.add(it);
        }

        return list;//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12]
    }
}
