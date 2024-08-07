import java.util.ArrayList;

public class A_SecondLargest {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        int[] arr={9,9,9,8};

        int large=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        int sec_large_no=seclarge;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large ){
                seclarge=large;
                large=arr[i];


            }
            else if (arr[i]>seclarge && arr[i]!=large) {
                seclarge=arr[i];

            }
        }

        int result = (seclarge == sec_large_no) ? -1 : seclarge;
        //System.out.println(result);
        ArrayList<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        int a=sec(l);
        System.out.println(a);
    }

    private static int sec(ArrayList<Integer> l) {
        int large = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
//        System.out.println(large);
//        System.out.println(seclarge);

        for (int i = 0; i < l.size(); i++) {
            if (large < l.get(i)) {
                seclarge = large;

                large = l.get(i);
            } else if (seclarge > l.get(i) && l.get(i) != large)
                seclarge = l.get(i);

        }
        return seclarge;
    }



}