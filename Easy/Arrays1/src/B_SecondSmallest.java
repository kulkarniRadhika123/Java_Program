public class B_SecondSmallest {
    public static void main(String[] args) {
        int[] a={7,7,7,7,6};

        int ans=secondSmallest(a);
        System.out.println(ans);


    }

    private static int secondSmallest(int[] a) {
        int smallest=Integer.MAX_VALUE;
        int sec_smallest=Integer.MAX_VALUE;

//        int second=sec_smallest;

        for (int i=0;i<a.length;i++){
            if(a[i]<smallest){
                sec_smallest=smallest;
                smallest=a[i];

            } else if (a[i]<sec_smallest && a[i]!=smallest) {
                sec_smallest=a[i];

            }
        }

  //      if(second==sec_smallest){
    //        return -1;
      //  }
        return sec_smallest;
    }
}
