public class J_RotateLeftWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int k=2;

        leftShift(arr,k);
    }



    private static void leftShift(int[] arr, int k) {
        int n=arr.length;
        System.out.println(n);
         k=k%n;
        reverse(arr,0,n-k-1);//0(K)
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr,n-k,n-1);//O(n-k)
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr,0,n-1);//O(n)

        //0(K+n-K+n)=O(2n)------>Time complexity

        //Spcae extra--->O(1) since no extra array is used
        System.out.println("Rotated array with time complexity O(2n)");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int[] arr,int start,int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}
