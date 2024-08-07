public class P_ConsecutiveNumberFrequency {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,1,0,1};
        int n=arr.length;

        find(arr,n);
    }

    private static void find(int[] arr, int n) {
        int count=0;
        int maxcount=0;// Without maxcount, you would not be able to store and return the maximum sequence length,
        // as count gets reset to zero whenever a zero is encountered in the array.
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }

            maxcount=Math.max(maxcount,count);

        }
        System.out.println(maxcount);
    }
}
