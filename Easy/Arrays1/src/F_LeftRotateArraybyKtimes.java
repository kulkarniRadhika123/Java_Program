public class F_LeftRotateArraybyKtimes {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int k=2;

        leftShift(arr,k);
    }

    private static void leftShift(int[] arr,int k) {

        int[] temp=new int[(arr.length-1)-(arr.length-1-k)];
        int n=arr.length;
        int d=k%n;

        for(int i=0;i<d;i++){
            temp[i]=arr[i];

        }

      for(int i=d;i<n;i++){
          arr[i-d]=arr[i];
      }


        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        int j=0;
      for(int i=n-d;i<n;i++){
          arr[i]=temp[j];
          j++;
      }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
