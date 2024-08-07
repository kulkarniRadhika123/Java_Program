public class Q_SingleNumber {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,4,4,8,8,3,9};
        int n=arr.length;

        int ans=find(arr,n);
        System.out.println(ans);
    }

    private static int find(int[] arr, int n) {
        int a=0;
        for(int i=0;i<n;i++){
            a=a^arr[i];
        }
        return a;
    }
}
